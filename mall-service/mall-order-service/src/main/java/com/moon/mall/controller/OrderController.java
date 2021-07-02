package com.moon.mall.controller;

import com.moon.mall.entity.Order;
import com.moon.mall.service.OrderService;
import com.moon.mall.service.OrderSkuService;
import com.moon.mall.util.RespResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2021-07-02 15:18:14
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    @Resource
    private OrderSkuService orderSkuService;


    @GetMapping("/{id}")
    public RespResult demo(@PathVariable String id){
        orderSkuService.update(id);
        return RespResult.ok();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Order selectOne(String id) {
        return this.orderService.queryById(id);
    }

}
