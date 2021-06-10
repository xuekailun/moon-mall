package com.moon.mall.util;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页Page参数
 * @Auther Xue KaiLun
 * @Date 2021-06-04 16:05
 */
@Data
public class BasePageParam implements Serializable {

    /* 当前页*/
    private Integer pageNum = 1;

    /* 查询数量*/
    private Integer pageSize = 15;
}
