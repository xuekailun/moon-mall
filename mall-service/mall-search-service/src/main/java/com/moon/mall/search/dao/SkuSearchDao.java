package com.moon.mall.search.dao;

import com.moon.mall.search.model.SkuEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface SkuSearchDao extends ElasticsearchCrudRepository<SkuEs,String> {
}
