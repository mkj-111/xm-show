package com.xm.controller;

import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class GoodsController {

@Resource
    private com.xm.service.GoodsService goodsService;

@RequestMapping("find")
    public List<xmgoods>find(){
    return goodsService.find();
}
    @RequestMapping("delete")
    public void delete(@RequestParam Integer id) {
        goodsService.delete(id);
    }

    @RequestMapping("add")
    public void add(@RequestBody xmgoods po) {
        goodsService.add(po);

    }

    @RequestMapping("select")
    public xmgoods select(@RequestParam Integer id) {

        return goodsService.select(id);
    }

}
