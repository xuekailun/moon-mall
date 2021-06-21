package com.moon.mall.search.controller;

import com.moon.mall.search.model.SkuEs;
import com.moon.mall.search.service.SkuSearchService;
import com.moon.mall.util.RespResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-21 15:38
 */
@RestController
@RequestMapping("/search")
public class SkuSearchController {

    @Resource
    private SkuSearchService skuSearchService;


    @PostMapping("/add")
    public RespResult add(@RequestBody SkuEs skuEs){
        skuSearchService.add(skuEs);
        return RespResult.ok();
    }

    @GetMapping("/del/{id}")
    public RespResult del(@PathVariable("id") String id){
        skuSearchService.del(id);
        return RespResult.ok();
    }

}

