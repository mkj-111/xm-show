package com.xm.controller;

import com.xm.entity.xmcontent;
import com.xm.service.ContentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("con")
public class ContentController {
    @Resource
    private ContentService contentService;

    @RequestMapping("findll")
    @ResponseBody
    public List<xmcontent> findw() {
        return contentService.findw();
    }


    @RequestMapping("deletell")
    @ResponseBody
    public void delete(Integer id) {
        contentService.delete(id);
    }

    @RequestMapping("addll")
    @ResponseBody
    public void insert(xmcontent po) {
        contentService.add(po);
    }

    @RequestMapping("huixianll")
    @ResponseBody
    public xmcontent selectId(Integer id) {

        return contentService.select(id);
    }
}
