package com.xm.controller;

import com.xm.entity.xmcontent;
import com.xm.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("con")
public class ContentController {
 @Resource
    private ContentService contentService;

 @RequestMapping("find")
    public List<xmcontent>findw(){
     return contentService.findw();
 }
}
