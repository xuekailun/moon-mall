package com.moon.mall.goods.dao;

import com.moon.mall.goods.entity.Sku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品表(Sku)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-11 16:23:26
 */
public interface SkuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sku queryById(String id);

    /**
     * 通过id查询商品列表数量
     * @param skuIds
     * @return
     */
    List<Sku> selectSkuById(List<String> skuIds);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Sku> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sku 实例对象
     * @return 对象列表
     */
    List<Sku> queryAll(Sku sku);

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 影响行数
     */
    int insert(Sku sku);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Sku> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Sku> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Sku> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Sku> entities);

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 影响行数
     */
    int update(Sku sku);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}

