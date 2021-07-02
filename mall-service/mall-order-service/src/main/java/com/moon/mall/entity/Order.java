package com.moon.mall.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2021-07-02 15:18:11
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 365133449965806727L;
    /**
     * 订单id
     */
    private String id;
    /**
     * 数量合计
     */
    private Integer totalNum;
    /**
     * 金额合计
     */
    private Integer moneys;
    /**
     * 支付类型，1、在线支付、0 货到付款
     */
    private String payType;
    /**
     * 订单创建时间
     */
    private Date createTime;
    /**
     * 订单更新时间
     */
    private Date updateTime;
    /**
     * 付款时间
     */
    private Date payTime;
    /**
     * 发货时间
     */
    private Date consignTime;
    /**
     * 交易完成时间
     */
    private Date endTime;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 收货人
     */
    private String recipients;
    /**
     * 收货人手机
     */
    private String recipientsMobile;
    /**
     * 收货人地址
     */
    private String recipientsAddress;
    /**
     * 交易流水号
     */
    private String weixinTransactionId;
    /**
     * 订单状态,0:未完成,1:已完成，2：已退货
     */
    private Integer orderStatus;
    /**
     * 支付状态,0:未支付，1：已支付，2：支付失败
     */
    private Integer payStatus;
    /**
     * 是否删除
     */
    private Integer isDelete;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getMoneys() {
        return moneys;
    }

    public void setMoneys(Integer moneys) {
        this.moneys = moneys;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getRecipientsMobile() {
        return recipientsMobile;
    }

    public void setRecipientsMobile(String recipientsMobile) {
        this.recipientsMobile = recipientsMobile;
    }

    public String getRecipientsAddress() {
        return recipientsAddress;
    }

    public void setRecipientsAddress(String recipientsAddress) {
        this.recipientsAddress = recipientsAddress;
    }

    public String getWeixinTransactionId() {
        return weixinTransactionId;
    }

    public void setWeixinTransactionId(String weixinTransactionId) {
        this.weixinTransactionId = weixinTransactionId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

}
