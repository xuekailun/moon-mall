package com.moon.mall.goods.service;

import com.moon.mall.goods.entity.Sku;

import java.util.List;

/**
 * 商品表(Sku)表服务接口
 *
 * @author makejava
 * @since 2021-06-11 16:23:26
 */
public interface SkuService {

    /**
     * 通过商品分类Id查询对应的产品列表
     * @param typeId
     * @return
     */
    List<Sku> typeSkuItems(Integer typeId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sku queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Sku> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    Sku insert(Sku sku);

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    Sku update(Sku sku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
