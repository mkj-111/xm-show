package com.xm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class xmgoods {
    private Integer id;

    private String goodsName;

    private String goodsStatus;

    private String goodsCaption;

    private Integer goodsVersionId;

    private Integer goodsTypeid;

    private String goodsImg;

    private String goodsColorId;

    private String goodsImgAll;

    private String goodsInfo;

    private Integer goodsNum;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date goodsDate;

    private Integer goodsRemen;

    private String versionName;

    private String colorName;
    private Long goodsPrice;
    private String text;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsCaption() {
        return goodsCaption;
    }

    public void setGoodsCaption(String goodsCaption) {
        this.goodsCaption = goodsCaption;
    }

    public Integer getGoodsVersionId() {
        return goodsVersionId;
    }

    public void setGoodsVersionId(Integer goodsVersionId) {
        this.goodsVersionId = goodsVersionId;
    }

    public Integer getGoodsTypeid() {
        return goodsTypeid;
    }

    public void setGoodsTypeid(Integer goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(String goodsColorId) {
        this.goodsColorId = goodsColorId;
    }

    public String getGoodsImgAll() {
        return goodsImgAll;
    }

    public void setGoodsImgAll(String goodsImgAll) {
        this.goodsImgAll = goodsImgAll;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    public Integer getGoodsRemen() {
        return goodsRemen;
    }

    public void setGoodsRemen(Integer goodsRemen) {
        this.goodsRemen = goodsRemen;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}