package com.xm.controller;

import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class GoodsController {

    @Resource
    private com.xm.service.GoodsService goodsService;

    @RequestMapping("find")
    public List<xmgoods> find(@RequestBody xmgoods goods) {
        return goodsService.find(goods);
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

    @RequestMapping("status")
    public void status(@RequestParam Integer id){
         goodsService.status(id);
    }
    @RequestMapping("xiajia")
    public void xiajia(@RequestParam Integer id){
         goodsService.xiajia(id);
    }

}
