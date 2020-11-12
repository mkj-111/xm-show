package com.xm.controller;

import com.xm.entity.Area;
import com.xm.service.AreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AreaController {
    @Resource
    private AreaService AreaService;

    @RequestMapping("areafindll")
    public List<Area> areafindll() {
        return AreaService.areafindll();
    }
}
