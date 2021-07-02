package com.moon.mall.service;

import com.moon.mall.entity.OrderSku;

import java.util.List;

/**
 * (OrderSku)表服务接口
 *
 * @author makejava
 * @since 2021-07-02 16:39:29
 */
public interface OrderSkuService {

    void update(String id);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderSku queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderSku> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderSku 实例对象
     * @return 实例对象
     */
    OrderSku insert(OrderSku orderSku);

    /**
     * 修改数据
     *
     * @param orderSku 实例对象
     * @return 实例对象
     */
    OrderSku update(OrderSku orderSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}
