package com.moon.mall.goods.controller;

import com.moon.mall.goods.entity.AdItems;
import com.moon.mall.goods.service.AdItemsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AdItems)表控制层
 *
 * @author makejava
 * @since 2021-06-03 18:45:56
 */
@RestController
@RequestMapping("adItems/")
public class AdItemsController {
    /**
     * 服务对象
     */
    @Resource
    private AdItemsService adItemsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdItems selectOne(Integer id) {
        return this.adItemsService.queryById(id);
    }

}
