package com.xm.controller;

import com.xm.entity.Area;
import com.xm.service.AreaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("area")
public class AreaController {
    @Resource
    private AreaService areaService;

    @RequestMapping("areafindll")
    @ResponseBody
    public List<Area> areafindll() {
        return areaService.areafindll();
    }
}
