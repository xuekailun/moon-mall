package com.moon.mall.entity;

import java.io.Serializable;

/**
 * (OrderSku)实体类
 *
 * @author makejava
 * @since 2021-07-02 16:39:29
 */
public class OrderSku implements Serializable {
    private static final long serialVersionUID = 789493029342137249L;
    /**
     * ID
     */
    private String id;
    /**
     * 1级分类
     */
    private Integer categoryOneId;
    /**
     * 2级分类
     */
    private Integer categoryTwoId;
    /**
     * 3级分类
     */
    private Integer categoryThreeId;
    /**
     * SPU_ID
     */
    private String spuId;
    /**
     * SKU_ID
     */
    private String skuId;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 单价
     */
    private Integer price;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 总金额
     */
    private Integer money;
    /**
     * 图片地址
     */
    private String image;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCategoryOneId() {
        return categoryOneId;
    }

    public void setCategoryOneId(Integer categoryOneId) {
        this.categoryOneId = categoryOneId;
    }

    public Integer getCategoryTwoId() {
        return categoryTwoId;
    }

    public void setCategoryTwoId(Integer categoryTwoId) {
        this.categoryTwoId = categoryTwoId;
    }

    public Integer getCategoryThreeId() {
        return categoryThreeId;
    }

    public void setCategoryThreeId(Integer categoryThreeId) {
        this.categoryThreeId = categoryThreeId;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
