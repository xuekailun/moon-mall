package com.moon.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther Xue KaiLun
 * @Date 2021-07-02 15:08
 */
@SpringBootApplication
@MapperScan(value = "com.moon.mall.dao")
public class MallOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallOrderServiceApplication.class,args);
    }
}
