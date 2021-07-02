package com.moon.mall.dao;

import com.moon.mall.entity.OrderSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (OrderSku)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-02 16:39:29
 */
public interface OrderSkuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderSku queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderSku> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderSku 实例对象
     * @return 对象列表
     */
    List<OrderSku> queryAll(OrderSku orderSku);

    /**
     * 新增数据
     *
     * @param orderSku 实例对象
     * @return 影响行数
     */
    int insert(OrderSku orderSku);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderSku> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderSku> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderSku> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderSku> entities);

    /**
     * 修改数据
     *
     * @param orderSku 实例对象
     * @return 影响行数
     */
    int update(OrderSku orderSku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

