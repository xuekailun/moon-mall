package com.moon.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-03 17:21
 */
@SpringBootApplication
@MapperScan(value = "com.moon.mall.goods.dao")
// 开启缓存
//@EnableCaching
public class MallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class,args);
    }
}
