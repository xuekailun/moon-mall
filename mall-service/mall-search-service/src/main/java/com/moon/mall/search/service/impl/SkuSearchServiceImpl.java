package com.moon.mall.search.service.impl;

import com.moon.mall.search.dao.SkuSearchDao;
import com.moon.mall.search.model.SkuEs;
import com.moon.mall.search.service.SkuSearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-21 15:23
 */
@Service
public class SkuSearchServiceImpl implements SkuSearchService {
    @Resource
    private SkuSearchDao skuSearchDao;

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
