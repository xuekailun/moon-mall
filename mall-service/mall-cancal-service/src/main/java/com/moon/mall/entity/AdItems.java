package com.moon.mall.entity;

import java.io.Serializable;

/**
 * (AdItems)实体类
 *
 * @author makejava
 * @since 2021-06-03 18:10:51
 */
public class AdItems implements Serializable {
    private static final long serialVersionUID = 592562970728257666L;

    private Integer id;

    private String name;
    /**
     * 分类，1首页推广,2列表页推广
     */
    private Integer type;
    /**
     * 展示的产品
     */
    private String skuId;
    /**
     * 排序
     */
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}
