package com.xm.service;

import com.aliyun.oss.OSS;
import com.xm.config.AliyunConfig;
import com.xm.vo.ImgFileUploadResult;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Service
public class ImgFileService {
    @Autowired
    private OSS ossClient;

    @Autowired
    private AliyunConfig aliyunConfig;

    //允许文件上传的格式
    private static final String[] IMAGE_TYPE = new String[]{".jpeg",".jpg",".gif",".png"};


    public ImgFileUploadResult uploadfile(MultipartFile uploadFile) {
        //校验图片格式
        boolean isLegal = false;
        for (String type : IMAGE_TYPE){
            if(StringUtils.endsWithIgnoreCase(uploadFile.getOriginalFilename(),type)){
                isLegal = true;
                break;
            }
        }
        //
        ImgFileUploadResult imgFileUploadResult = new ImgFileUploadResult();
        if(!isLegal){
            imgFileUploadResult.setStatus("error");
            return imgFileUploadResult;
        }

        //文件名称
        String fileName = uploadFile.getOriginalFilename();
        //文件的新路径
        String filePath = getFilePath(fileName);
        try {
            ossClient.putObject(aliyunConfig.getBucketName(),filePath,new ByteArrayInputStream(uploadFile.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //上传成功
        imgFileUploadResult.setStatus("done");
        //文件路径需要保存到数据库 this.aliyunConfig.getUrlPreFix()+
        String urlPrefix = this.aliyunConfig.getUrlPrefix();
        imgFileUploadResult.setName("http://" + urlPrefix + "/" + filePath);
        System.out.println(imgFileUploadResult.getName());

        return imgFileUploadResult;
    }

    //处理时间
    private String getFilePath(String sourceFileName){
        DateTime dateTime = new DateTime();
        return "images/" + dateTime.toString("yyyy")
                + "/" + dateTime.toString("mm") + "/"
                + dateTime.toString("dd") + "/" + System.currentTimeMillis() +
                RandomUtils.nextInt(100,9999) + "." +
                StringUtils.substringAfterLast(sourceFileName,".");
    }

}
