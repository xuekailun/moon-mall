package com.moon.mall.search.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.moon.mall.search.dao.SkuSearchDao;
import com.moon.mall.search.model.SkuEs;
import com.moon.mall.search.service.SkuSearchService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.Aggregations;
import org.elasticsearch.search.aggregations.bucket.terms.ParsedStringTerms;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.aggregation.AggregatedPage;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-21 15:23
 */
@Service
public class SkuSearchServiceImpl implements SkuSearchService {

    @Resource
    private SkuSearchDao skuSearchDao;

    /**
     * 商品搜索
     * @param searchMap
     * @return
     */
    @Override
    public Map<String, Object> search(Map<String, Object> searchMap) {

        // QueryBuilder -> 构建搜索条件
        NativeSearchQueryBuilder queryBuilder = this.queryBuilder(searchMap);

        // 分组搜索查询
        this.group(queryBuilder,searchMap);

        // skuSerachDao 进行搜索
//        Page<SkuEs> page = skuSearchDao.search(queryBuilder.build());
        // 执行搜索  接受对象更换，并强转
        AggregatedPage<SkuEs> result = (AggregatedPage<SkuEs>) skuSearchDao.search(queryBuilder.build());

        // 分组数据
        Map<String,Object> groups = this.parseGroup(result.getAggregations());

        // 属性信息合并
        this.attrParse(groups);

        List<SkuEs> list = result.getContent();

        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("list",list);
        resultMap.put("totalElements",result.getTotalElements());
        resultMap.putAll(groups);

        return resultMap;
    }

    /**
     * 将属性信息合并成Map对象
     * {\"就业薪资\":\"10K起\",\"学习费用\":\"2万\"}
     * @param searchMap
     */
    public void attrParse(Map<String,Object> searchMap){
        // 先获取 attrmaps
        List<String> attrMaps = (List<String>) searchMap.get("attrmaps");

        if(!CollectionUtils.isEmpty(attrMaps)){
            Map<String, Set<String>> allMaps = new HashMap<>();
            // 循环集合
            for(String attr : attrMaps){
                Map<String,String> attrMap = JSON.parseObject(attr,Map.class);

                for(Map.Entry<String,String> entry : attrMap.entrySet()){
                    String key = entry.getKey();
                    String value = entry.getValue();
                    Set<String> keys = new HashSet<>();

                    keys.add(value);

                    allMaps.put(key,keys);
                }
            }

            //  获取每条记录，将记录转成Map
            searchMap.put("attrmaps",allMaps);
        }
    }

    /**
     * 分组结果解析
     * @param aggregations
     * @return
     */
    public Map<String,Object> parseGroup(Aggregations aggregations){
        // 存储结果集
        Map<String,Object> groupMap = new HashMap<>();

        for(Aggregation aggregation : aggregations){
            // 强转ParsedStringTerms
            ParsedStringTerms pst = (ParsedStringTerms) aggregation;

            List<String> values = new ArrayList<>();

            for(Terms.Bucket bucket : pst.getBuckets()){
                // 单个对象值
                values.add(bucket.getKeyAsString());
            }

            // 存入map中
            groupMap.put(pst.getName(),values);
        }

        return groupMap;
    }

    /**
     * 搜索条件构建
     * @param searchMap
     * @return
     */
    private NativeSearchQueryBuilder queryBuilder(Map<String,Object> searchMap){
        NativeSearchQueryBuilder builder = new NativeSearchQueryBuilder();

        // 判断条件是否为空
        if(null != searchMap){
            // 关键词条件
            Object keyWords = searchMap.get("keywords");

            if(!StringUtils.isEmpty(keyWords)){
                /**
                 * matchQuery：会将搜索词分词，再与目标查询字段进行匹配，若分词中的任意一个词与目标字段匹配上，则可查询到。
                 * termQuery：不会对搜索词进行分词处理，而是作为一个整体与目标字段进行匹配，若完全匹配，则可查询到。
                 */
//                builder.withQuery(QueryBuilders.termQuery("name",keyWords.toString()));
                builder.withQuery(QueryBuilders.matchQuery("name",keyWords.toString()));
            }
        }

        return builder;
    }

    /**
     * 分组查询
     * @param builder
     * @param searchMap
     */
    public void group(NativeSearchQueryBuilder builder,Map<String,Object> searchMap){
        // 前端没有传入分类参数的时候 查询分类集合作为搜索条件
        if(StringUtils.isEmpty(searchMap.get("category"))){
            // 分类分组
            builder.addAggregation(AggregationBuilders
                    .terms("categoryList") // 插叙的数据对应别名
                    .field("categoryName") // 根据categoryName分组
                    .size(100) // 分组查询100条
            );
        }

        if(StringUtils.isEmpty(searchMap.get("brand"))){
            // 品牌分组
            builder.addAggregation(AggregationBuilders
                    .terms("brandList") // 插叙的数据对应别名
                    .field("brandName") // 根据brandName分组
                    .size(100) // 分组查询100条
            );
        }

        // 属性分组查询
        builder.addAggregation(AggregationBuilders
                .terms("attrmaps") // 插叙的数据对应别名
                .field("skuAttribute") // 根据skuAttribute分组
                .size(100000) // 分组查询100000条
        );
    }

    /**
     * 添加索引
     * @param skuEs
     */
    @Override
    public void add(SkuEs skuEs) {
       skuSearchDao.save(skuEs);
    }

    /**
     * 删除索引
     * @param id
     */
    @Override
    public void del(String id) {
        skuSearchDao.deleteById(id);
    }
}
