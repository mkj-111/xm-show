package com.xm.vo;

import lombok.Data;

@Data
public class ImgFileUploadResult {

    //文件名
    private String name;

    //状态 : uploading done error removed
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
