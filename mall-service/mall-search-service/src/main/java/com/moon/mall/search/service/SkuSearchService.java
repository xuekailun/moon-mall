package com.moon.mall.search.service;

import com.moon.mall.search.model.SkuEs;

import java.util.Map;

public interface SkuSearchService {

    /**
     * 商品搜索
     * @param searchMap
     * @return
     */
    Map<String,Object> search(Map<String,Object> searchMap);

    // 增加索引
    void add(SkuEs skuEs);

    // 删除索引
    void del(String id);
}
