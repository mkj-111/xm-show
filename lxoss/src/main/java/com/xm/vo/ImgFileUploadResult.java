package com.xm.vo;

import lombok.Data;

@Data
public class ImgFileUploadResult {

    //文件名
    private String name;

    //状态 : uploading done error removed
    private String status;


}
