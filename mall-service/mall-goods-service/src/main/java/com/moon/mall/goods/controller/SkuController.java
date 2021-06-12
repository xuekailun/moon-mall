package com.moon.mall.goods.controller;

import com.moon.mall.goods.service.SkuService;
import com.moon.mall.util.RespResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * 查询商品的接口
 * @Auther Xue KaiLun
 * @Date 2021-06-11 16:45
 */
@RestController
@RequestMapping("sku/")
public class SkuController {

    @Resource
    private SkuService skuService;


    /**
     * 根据推广产品分类ID查询Sku列表
     * @param id
     * @return
     */
    @ApiOperation("通过类型id查询商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "类型Id",dataType = "int",required = true,example = "1")
    })
    @GetMapping("aditems/type/{id}")

    public RespResult typeItems(@PathVariable("id") Integer id){
        return RespResult.ok(skuService.typeSkuItems(id));
    }
}
