package com.moon.mall.search.service;

import com.moon.mall.search.model.SkuEs;

public interface SkuSearchService {

    // 增加索引
    void add(SkuEs skuEs);

    // 删除索引
    void del(String id);
}
