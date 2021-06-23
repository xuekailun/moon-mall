package com.moon.mall.search.dao;

import com.moon.mall.search.model.SkuEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SkuSearchDao extends ElasticsearchRepository<SkuEs,String> {

}
