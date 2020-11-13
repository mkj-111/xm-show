package com.xm.controller;

import com.xm.entity.TorderVo;
import com.xm.service.TorderSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController1 {
    @Autowired
    private TorderSrevice torderSrevice ;
    //highcharts报表

    @RequestMapping("/highcharts")
    public List<TorderVo> highcharts(){
        List<TorderVo> list=torderSrevice.highcharts();

        return list;
    }

}
