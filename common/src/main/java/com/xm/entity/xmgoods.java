package com.xm.entity;

import lombok.Data;

import java.util.Date;
@Data
public class xmgoods {
    private Integer id;

    private String goodsName;

    private String goodsStatus;

    private String goodsCaption;

    private Integer goodsTypeId;

    private String goodsImg;

    private String goodsColorId;

    private String goodsImgAll;

    private String goodsInfo;

    private Integer goodsNum;

    private Date goodsDate;

    private Long goodsPrice;
    private String text;

    private String info;
    private String colorName;

    private String versionName;

    public Integer getId() {
        return id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public String getGoodsCaption() {
        return goodsCaption;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public String getGoodsColorId() {
        return goodsColorId;
    }

    public String getGoodsImgAll() {
        return goodsImgAll;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public String getText() {
        return text;
    }

    public String getInfo() {
        return info;
    }

    public String getColorName() {
        return colorName;
    }

    public String getVersionName() {
        return versionName;
    }
}