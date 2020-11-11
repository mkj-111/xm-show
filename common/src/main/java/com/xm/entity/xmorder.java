package com.xm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class xmorder implements Serializable {

    private static final long serialVersionUID = -6871805105087384107L;
    private Integer orderId;

    private Integer orderNumber;

    private Integer orderStatus;

    private Integer payStatus;

    private Long orderPrice;

    private String goodsName;

    private Integer goodsNum;

    private Integer userId;

    private String orderInfo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date deliverytime;
    private String Orderstatusname;

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public void setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public void setOrderstatusname(String orderstatusname) {
        Orderstatusname = orderstatusname;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public Long getOrderPrice() {
        return orderPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public String getOrderstatusname() {
        return Orderstatusname;
    }
}
