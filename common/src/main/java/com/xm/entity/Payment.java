package com.xm.entity;

public class Payment {
    private Integer id;

    private String paymentThumbnail;

    private String paymentName;

    private String paymentShow;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentThumbnail() {
        return paymentThumbnail;
    }

    public void setPaymentThumbnail(String paymentThumbnail) {
        this.paymentThumbnail = paymentThumbnail == null ? null : paymentThumbnail.trim();
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    public String getPaymentShow() {
        return paymentShow;
    }

    public void setPaymentShow(String paymentShow) {
        this.paymentShow = paymentShow == null ? null : paymentShow.trim();
    }
}