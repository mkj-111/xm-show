package com.xm.controller;

import com.xm.entity.xmcontent;
import com.xm.service.ContentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ContentController {
   @Resource
    private ContentService contentService;

 @RequestMapping("findll")
    public List<xmcontent>findw(){
     return contentService.findw();
 }
    @RequestMapping("deletell")
    public void delete(@RequestParam Integer id) {

        contentService.delete(id);
    }

    @RequestMapping("addll")
    public void add(@RequestBody xmcontent po) {
        contentService.add(po);

    }

    @RequestMapping("selectll")
    public xmcontent select(@RequestParam Integer id) {

        return contentService.select(id);
    }
    //导入
    @RequestMapping("daoru")
    @ResponseBody
    public void importExcel(MultipartFile filename){
        contentService.importExcel(filename);
    }



}
