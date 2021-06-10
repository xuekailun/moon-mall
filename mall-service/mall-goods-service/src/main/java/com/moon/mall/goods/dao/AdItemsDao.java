package com.moon.mall.goods.dao;

import com.moon.mall.goods.entity.AdItems;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (AdItems)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-03 18:10:54
 */
@Mapper
public interface AdItemsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdItems queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AdItems> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param adItems 实例对象
     * @return 对象列表
     */
    List<AdItems> queryAll(AdItems adItems);

    /**
     * 新增数据
     *
     * @param adItems 实例对象
     * @return 影响行数
     */
    int insert(AdItems adItems);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdItems> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AdItems> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AdItems> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AdItems> entities);

    /**
     * 修改数据
     *
     * @param adItems 实例对象
     * @return 影响行数
     */
    int update(AdItems adItems);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

