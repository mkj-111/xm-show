package com.xm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class After {
    private Integer id;

    private Integer afterNum;

    private String afterUsername;

    private Integer afterFacilitynum;

    private String afterProductname;

    private String afterReason;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date afterDate;

    private String afterStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAfterNum() {
        return afterNum;
    }

    public void setAfterNum(Integer afterNum) {
        this.afterNum = afterNum;
    }

    public String getAfterUsername() {
        return afterUsername;
    }

    public void setAfterUsername(String afterUsername) {
        this.afterUsername = afterUsername == null ? null : afterUsername.trim();
    }

    public Integer getAfterFacilitynum() {
        return afterFacilitynum;
    }

    public void setAfterFacilitynum(Integer afterFacilitynum) {
        this.afterFacilitynum = afterFacilitynum;
    }

    public String getAfterProductname() {
        return afterProductname;
    }

    public void setAfterProductname(String afterProductname) {
        this.afterProductname = afterProductname == null ? null : afterProductname.trim();
    }

    public String getAfterReason() {
        return afterReason;
    }

    public void setAfterReason(String afterReason) {
        this.afterReason = afterReason == null ? null : afterReason.trim();
    }

    public Date getAfterDate() {
        return afterDate;
    }

    public void setAfterDate(Date afterDate) {
        this.afterDate = afterDate;
    }

    public String getAfterStatus() {
        return afterStatus;
    }

    public void setAfterStatus(String afterStatus) {
        this.afterStatus = afterStatus == null ? null : afterStatus.trim();
    }
}