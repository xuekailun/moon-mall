package com.moon.mall.goods.controller;


import com.github.pagehelper.PageInfo;
import com.moon.mall.goods.entity.Brand;
import com.moon.mall.goods.service.BrandService;
import com.moon.mall.util.RespResult;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 品牌表(Brand)表控制层
 *
 * @author makejava
 * @since 2021-06-03 18:46:28
 */
@Slf4j
@RestController
@RequestMapping("brand/")
public class BrandController {
    /**
     * 服务对象
     */
    @Autowired
    private BrandService brandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("查询单挑数据")
    @GetMapping("selectOne")
    public RespResult selectOne() {
        PageInfo<Brand> pageInfo = brandService.finAll(2,1);

        return RespResult.ok(pageInfo);


    }

}
