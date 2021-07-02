package com.moon.mall.goods.service.impl;

import com.moon.mall.goods.entity.AdItems;
import com.moon.mall.goods.entity.Sku;
import com.moon.mall.goods.dao.SkuDao;
import com.moon.mall.goods.service.AdItemsService;
import com.moon.mall.goods.service.SkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品表(Sku)表服务实现类
 *
 * @author makejava
 * @since 2021-06-11 16:23:26
 */
@Slf4j
@Service("skuService")
public class SkuServiceImpl implements SkuService {
    @Resource
    private SkuDao skuDao;

    @Resource
    private AdItemsService adItemsService;

    @Resource
    private StringRedisTemplate template;


    /**
     * 通过商品分类Id查询对应的产品列表
     * cacheNames = "ad-items-skus" : 命名空间
     * key = "#typeId": 入参id作为缓存的key，使用的是SpEL表达式
     * @param typeId
     * @return
     */
    @Cacheable(cacheNames = "ad-items-skus",key = "#typeId")
    public List<Sku> typeSkuItems(Integer typeId){
        log.info("请求数据库查询");
        List<AdItems> adItems = adItemsService.selectItemsByTypeId(typeId);

        List<String> skdIds = adItems.stream().map(AdItems::getSkuId).collect(Collectors.toList());

        return this.selectSkuById(skdIds);
    }



    /**
     * 通过id查询商品列表数量
     * @param skuIds
     * @return
     */
    List<Sku> selectSkuById(List<String> skuIds){
        return skuDao.selectSkuById(skuIds);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Sku queryById(String id) {
        return this.skuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */

    @Override
    public List<Sku> queryAllByLimit(int offset, int limit) {
        return this.skuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    @Override
    public Sku insert(Sku sku) {
        this.skuDao.insert(sku);
        return sku;
    }

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    @Override
    public Sku update(Sku sku) {
        this.skuDao.update(sku);
        return this.queryById(sku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.skuDao.deleteById(id) > 0;
    }
}
