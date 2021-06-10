package com.moon.mall.goods.service;

import com.github.pagehelper.PageInfo;
import com.moon.mall.goods.entity.Brand;

import java.util.List;

/**
 * 品牌表(Brand)表服务接口
 *
 * @author makejava
 * @since 2021-06-03 18:46:27
 */
public interface BrandService {

    /***
     * 查询分页的demo
     * @param pageNum 当前页
     * @param pageSize 查询数量
     * @return
     */
    PageInfo<Brand> finAll(int pageNum, int pageSize);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Brand queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Brand> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
