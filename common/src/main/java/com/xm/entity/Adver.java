package com.xm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Adver {
    private Integer id;

    private String adverTitle;

    private String adverLead;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date adverCreateDate;

    private String adverIssueName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdverTitle() {
        return adverTitle;
    }

    public void setAdverTitle(String adverTitle) {
        this.adverTitle = adverTitle == null ? null : adverTitle.trim();
    }

    public String getAdverLead() {
        return adverLead;
    }

    public void setAdverLead(String adverLead) {
        this.adverLead = adverLead == null ? null : adverLead.trim();
    }

    public Date getAdverCreateDate() {
        return adverCreateDate;
    }

    public void setAdverCreateDate(Date adverCreateDate) {
        this.adverCreateDate = adverCreateDate;
    }

    public String getAdverIssueName() {
        return adverIssueName;
    }

    public void setAdverIssueName(String adverIssueName) {
        this.adverIssueName = adverIssueName == null ? null : adverIssueName.trim();
    }
}