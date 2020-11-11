package com.xm.service;

import com.xm.entity.xmcontent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="xmprovider")
public interface ContentService {
    @RequestMapping("findll")
    public List<xmcontent> findw();

    @RequestMapping("deletell")
    public void delete(@RequestParam Integer id);

    @RequestMapping("addll")
    public void add(@RequestBody xmcontent po);

    @RequestMapping("selectll")
    public xmcontent select(@RequestParam Integer id);
}
