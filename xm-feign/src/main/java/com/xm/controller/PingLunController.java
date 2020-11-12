package com.xm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("ping")
public class PingLunController {
    @Resource
    private com.xm.service.PingLunservice pingLunservice;

    @RequestMapping("insertq")
    @ResponseBody
    public void insertq(@RequestParam Integer oid, @RequestParam String info) {
        pingLunservice.insertq(oid, info);
    }
}
