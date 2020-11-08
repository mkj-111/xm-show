package com.xm.service;

import com.xm.entity.xmcontent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value="xmprovider")
public interface ContentService {
    @RequestMapping("findw")
    public List<xmcontent> findw();
}
