package com.xm.controller;

import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {

   @Resource
    private GoodsService goodsService;

@RequestMapping("find")
@ResponseBody
    public List<xmgoods>find(xmgoods goods){
    return goodsService.find(goods);
}
    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id) {
        goodsService.delete(id);

    }

    @RequestMapping("add")
    @ResponseBody
    public void insert(xmgoods po) {
        goodsService.add(po);
    }
    @RequestMapping("huixian")
    @ResponseBody
    public xmgoods selectId(Integer id){

        return goodsService.select(id);
    }


}
