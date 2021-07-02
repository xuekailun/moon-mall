package com.moon.mall.service.impl;

import com.moon.mall.entity.OrderSku;
import com.moon.mall.dao.OrderSkuDao;
import com.moon.mall.service.OrderSkuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderSku)表服务实现类
 *
 * @author makejava
 * @since 2021-07-02 16:39:30
 */
@Slf4j
@Service("orderSkuService")
public class OrderSkuServiceImpl implements OrderSkuService {
    @Resource
    private OrderSkuDao orderSkuDao;


    @Transactional
    public void update(String id){
        OrderSku orderSku = new OrderSku();
        orderSku.setId(id);
        orderSku.setNum(1);
        log.info("orderSku:{}",orderSku);
        orderSkuDao.update(orderSku);

        int i = 1/0;

    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderSku queryById(String id) {
        return this.orderSkuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderSku> queryAllByLimit(int offset, int limit) {
        return this.orderSkuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderSku 实例对象
     * @return 实例对象
     */
    @Override
    public OrderSku insert(OrderSku orderSku) {
        this.orderSkuDao.insert(orderSku);
        return orderSku;
    }

    /**
     * 修改数据
     *
     * @param orderSku 实例对象
     * @return 实例对象
     */
    @Override
    public OrderSku update(OrderSku orderSku) {
        this.orderSkuDao.update(orderSku);
        return this.queryById(orderSku.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.orderSkuDao.deleteById(id) > 0;
    }
}
