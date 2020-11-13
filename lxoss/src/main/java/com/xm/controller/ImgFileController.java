package com.xm.controller;

import com.xm.service.ImgFileService;
import com.xm.vo.ImgFileUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("imgFile")
public class ImgFileController {

    @Autowired
    private ImgFileService imgFileService;

    @RequestMapping("toUpload")
    public String toUpload(){
        return "upload";
    }
    @RequestMapping("uploadFile")
    @ResponseBody
    public ImgFileUploadResult uploadResult(@RequestParam("file") MultipartFile uploadFile){
        ImgFileUploadResult uploadfile = this.imgFileService.uploadfile(uploadFile);
        return uploadfile;
    }
}
