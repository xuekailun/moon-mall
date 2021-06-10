package com.moon.mall.goods.entity;

import java.io.Serializable;

/**
 * 品牌表(Brand)实体类
 *
 * @author makejava
 * @since 2021-06-03 18:46:27
 */
public class Brand implements Serializable {
    private static final long serialVersionUID = 621244922542836647L;
    /**
     * 品牌id
     */
    private Integer id;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌图片地址
     */
    private String image;
    /**
     * 品牌的首字母
     */
    private String initial;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}
