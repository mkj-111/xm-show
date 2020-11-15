package com.xm.entity;

import lombok.Data;

@Data
public class Order {
    private Integer id;

    private Integer userid;

    private String ordernum;

    private Long ordersumprice;

    private Integer orderstatus;

    private String receivingaddress;

    private String receivingtelephone;

    private String consignee;

    private String createtime;

    private String serialnumber;

    private String paytype;

    private String paymenttime;

    private String ordergoodsname;

    private String goodsid;

    private String goodsnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Long getOrdersumprice() {
        return ordersumprice;
    }

    public void setOrdersumprice(Long ordersumprice) {
        this.ordersumprice = ordersumprice;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getReceivingaddress() {
        return receivingaddress;
    }

    public void setReceivingaddress(String receivingaddress) {
        this.receivingaddress = receivingaddress;
    }

    public String getReceivingtelephone() {
        return receivingtelephone;
    }

    public void setReceivingtelephone(String receivingtelephone) {
        this.receivingtelephone = receivingtelephone;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(String paymenttime) {
        this.paymenttime = paymenttime;
    }

    public String getOrdergoodsname() {
        return ordergoodsname;
    }

    public void setOrdergoodsname(String ordergoodsname) {
        this.ordergoodsname = ordergoodsname;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(String goodsnum) {
        this.goodsnum = goodsnum;
    }
}