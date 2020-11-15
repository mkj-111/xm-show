package com.xm.controller;

import com.xm.service.impl.ImgFileService;
import com.xm.utils.AliyunOSSUtil;
import com.xm.vo.ImgFileUploadResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;

@Controller
@RequestMapping("img")
public class ImgFileController {

    @Autowired
    private ImgFileService imgFileService;

    @RequestMapping("toUpload")
    public String toUpload(){
        return "upload";
    }

    @RequestMapping("uploadFile")
    @ResponseBody
    public ImgFileUploadResult uploadResult(@RequestParam("smallPic") MultipartFile uploadFile) throws IOException {
        ImgFileUploadResult uploadfile = this.imgFileService.uploadfile(uploadFile);
        return uploadfile;
    }

    @RequestMapping("uploadImg")
    @ResponseBody
    public Object headImg(@RequestParam("smallPic") MultipartFile file) {
        try {
            MultipartFile multipartFile = file;
            String fileName = file.getOriginalFilename();
            String url = AliyunOSSUtil.uploadFile(fileName, multipartFile);
            System.out.println(url);
            return url;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "false";
    }
}
