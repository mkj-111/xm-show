package com.xm.service;

import com.xm.entity.TorderVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface TorderService {

    @RequestMapping("/highcharts")
    public List<TorderVo> highcharts();


}
