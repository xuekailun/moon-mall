package com.moon.mall.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.moon.mall.goods.entity.Brand;
import com.moon.mall.goods.dao.BrandDao;
import com.moon.mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌表(Brand)表服务实现类
 *
 * @author makejava
 * @since 2021-06-03 18:46:28
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private BrandDao brandDao;

    /***
     * 查询分页的demo
     * @param pageNum 当前页
     * @param pageSize 查询数量
     * @return
     */
    public PageInfo<Brand> finAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Brand> brandList = brandDao.selectAll();
        return new PageInfo<>(brandList);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Integer id) {
        return this.brandDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Brand> queryAllByLimit(int offset, int limit) {
        return this.brandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.brandDao.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.brandDao.update(brand);
        return this.queryById(brand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.brandDao.deleteById(id) > 0;
    }
}
