package com.moon.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther Xue KaiLun
 * @Date 2021-06-03 17:21
 */
@SpringBootApplication
@MapperScan(value = "com.moon.mall.goods.dao")
public class MallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class,args);
    }
}
