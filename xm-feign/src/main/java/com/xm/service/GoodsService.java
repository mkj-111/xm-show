package com.xm.service;

import com.xm.entity.xmgoods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface GoodsService {
    @RequestMapping("find")
    public List<xmgoods> find(@RequestBody xmgoods goods);

    @RequestMapping("delete")
    public void delete(@RequestParam Integer id);


    @RequestMapping("add")
    public void add(@RequestBody xmgoods po);


    @RequestMapping("select")
    public xmgoods select(@RequestParam Integer id);

}
