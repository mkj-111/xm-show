package com.xm.controller;

import com.xm.entity.After;
import com.xm.service.AfterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AfterController {

    @Resource
    private AfterService afterService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("yybfind")
    public List<After> find(){
        return afterService.find();
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("yybgetDelet")
    public void yybgetDelete(@RequestParam Integer id){
        afterService.getDelete(id);
    }
}
