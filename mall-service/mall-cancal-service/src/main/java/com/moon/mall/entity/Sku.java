package com.moon.mall.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.CacheNamespace;
import top.javatool.canal.client.annotation.CanalTable;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品表(Sku)实体类
 *
 * @author makejava
 * @since 2021-06-11 16:23:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    private String spu_id;

    private String spuId;
    /**
     * 类目ID
     */
    private Integer category_id;

    private Integer categoryId;
    /**
     * 类目名称
     */
    private String category_name;

    private String categoryName;
    /**
     * 品牌id
     */
    private Integer brand_id;

    private Integer brandId;
    /**
     * 品牌名称
     */
    private String brand_name;
    private String brandName;
    /**
     * 规格
     */
    private String skuAttribute;
    /**
     * 商品状态 1-正常，2-下架，3-删除
     */
    private Integer status;

}
