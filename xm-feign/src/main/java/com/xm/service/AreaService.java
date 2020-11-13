package com.xm.service;

import com.xm.entity.Area;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface AreaService {

    @RequestMapping("areafindll")
    public List<Area> areafindll();
}
