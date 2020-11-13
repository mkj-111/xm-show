package com.xm.service;

import com.xm.entity.After;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface AfterService {

    @RequestMapping("yybfind")
    public List<After> find();

    @RequestMapping("yybgetDelet")
    public void yybgetDelete(@RequestParam Integer id);

}
