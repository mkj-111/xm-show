package com.xm.service;

import com.xm.vo.ImgFileUploadResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "lxoss")
public interface ImgFileService {

    @RequestMapping("imgFile/uploadFile")
    public ImgFileUploadResult uploadResult(@RequestParam MultipartFile uploadFile);
}