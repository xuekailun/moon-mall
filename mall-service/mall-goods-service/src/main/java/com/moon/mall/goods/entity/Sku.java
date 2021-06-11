package com.moon.mall.goods.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 商品表(Sku)实体类
 *
 * @author makejava
 * @since 2021-06-11 16:23:26
 */
public class Sku implements Serializable {
    private static final long serialVersionUID = -22917494196027678L;
    /**
     * 商品id
     */
    private String id;
    /**
     * SKU名称
     */
    private String name;
    /**
     * 价格（分）
     */
    private Integer price;
    /**
     * 库存数量
     */
    private Integer num;
    /**
     * 商品图片
     */
    private String image;
    /**
     * 商品图片列表
     */
    private String images;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * SPUID
     */
    private String spuId;
    /**
     * 类目ID
     */
    private Integer categoryId;
    /**
     * 类目名称
     */
    private String categoryName;
    /**
     * 品牌id
     */
    private Integer brandId;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 规格
     */
    private String skuAttribute;
    /**
     * 商品状态 1-正常，2-下架，3-删除
     */
    private Integer status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSpuId() {
        return spuId;
    }

    public void setSpuId(String spuId) {
        this.spuId = spuId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSkuAttribute() {
        return skuAttribute;
    }

    public void setSkuAttribute(String skuAttribute) {
        this.skuAttribute = skuAttribute;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
