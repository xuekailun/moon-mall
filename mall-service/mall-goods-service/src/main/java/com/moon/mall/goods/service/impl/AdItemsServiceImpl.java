package com.moon.mall.goods.service.impl;

import com.moon.mall.goods.entity.AdItems;
import com.moon.mall.goods.dao.AdItemsDao;
import com.moon.mall.goods.service.AdItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AdItems)表服务实现类
 *
 * @author makejava
 * @since 2021-06-03 18:11:00
 */
@Service
public class AdItemsServiceImpl implements AdItemsService {
    @Resource
    private AdItemsDao adItemsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdItems queryById(Integer id) {
        return this.adItemsDao.queryById(id);
    }


    /***
     * 通过类型查询数据
     * @param type
     * @return
     */
    public List<AdItems> selectItemsByTypeId(Integer type){
        return adItemsDao.selectItemsByTypeId(type);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<AdItems> queryAllByLimit(int offset, int limit) {
        return this.adItemsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adItems 实例对象
     * @return 实例对象
     */
    @Override
    public AdItems insert(AdItems adItems) {
        this.adItemsDao.insert(adItems);
        return adItems;
    }

    /**
     * 修改数据
     *
     * @param adItems 实例对象
     * @return 实例对象
     */
    @Override
    public AdItems update(AdItems adItems) {
        this.adItemsDao.update(adItems);
        return this.queryById(adItems.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adItemsDao.deleteById(id) > 0;
    }
}
