package com.moon.mall.search.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
import java.util.Map;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-17 16:53
 *
 * indexName 就是ES 索引库的索引名字
 * type 就是当前对应对象的类型（理解成表的名字）
 */
@Data
@Document(indexName = "shopsearch",type = "skues")
public class SkuEs {
    /**
     * 商品id
     */
    @Id
    private String id;
    /**
     * SKU名称
     */
    private String name;
    /**
     * 价格（分）
     */
    private Integer price;
    /**
     * 库存数量
     */
    private Integer num;
    /**
     * 商品图片
     */
    private String image;
    /**
     * 商品图片列表
     */
    private String images;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * SPUID
     */
    private String spuId;
    /**
     * 类目ID
     */
    private Integer categoryId;
    /**
     * 类目名称
     */
    @Field(type = FieldType.Keyword) // keyword 代表部分词
    private String categoryName;
    /**
     * 品牌id
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    @Field(type = FieldType.Keyword)
    private String brandName;
    /**
     * 规格
     */
    private String skuAttribute;
    /**
     * 商品状态 1-正常，2-下架，3-删除
     */
    private Integer status;

    // 属性映射
    private Map<String,String> attrMap;
}
