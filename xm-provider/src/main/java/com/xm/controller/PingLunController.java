package com.xm.controller;

import com.xm.service.PingLunservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class PingLunController {

    @Resource
    private com.xm.service.PingLunservice pingLunservice;

    @RequestMapping("insertq")
    public void insertq(@RequestParam Integer oid, @RequestParam String info) {
        pingLunservice.insertq(oid, info);
    }
}
