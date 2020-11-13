package com.xm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("xmprovider")
public interface PingLunservice {

    @RequestMapping("insertq")
    public void insertq(@RequestParam Integer oid, @RequestParam String info);
}
