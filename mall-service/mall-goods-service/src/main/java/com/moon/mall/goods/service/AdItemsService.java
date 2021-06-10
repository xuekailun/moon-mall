package com.moon.mall.goods.service;

import com.moon.mall.goods.entity.AdItems;

import java.util.List;

/**
 * (AdItems)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 18:11:00
 */
public interface AdItemsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdItems queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AdItems> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adItems 实例对象
     * @return 实例对象
     */
    AdItems insert(AdItems adItems);

    /**
     * 修改数据
     *
     * @param adItems 实例对象
     * @return 实例对象
     */
    AdItems update(AdItems adItems);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
