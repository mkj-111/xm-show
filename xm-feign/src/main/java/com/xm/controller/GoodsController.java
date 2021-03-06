package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;

import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("find")
    @ResponseBody
    public List<xmgoods> find(xmgoods goods) {
        List<xmgoods> goodsList = (List<xmgoods>) redisUtil.get(RedisConstant.GOODS_LIST_KEY);
        if (goodsList == null || goodsList.isEmpty()) {
            goodsList = goodsService.find(goods);
            redisUtil.set(RedisConstant.GOODS_LIST_KEY, goodsList);
            redisUtil.expire(RedisConstant.GOODS_LIST_KEY, 60);
        }
        return goodsList;
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
    public xmgoods selectId(Integer id) {
        return goodsService.select(id);
    }
    @RequestMapping("status")
    @ResponseBody
    public void status(Integer id){
         goodsService.status(id);
    }


    @RequestMapping("xiajia")
    @ResponseBody
    public void xiajia(Integer id){
         goodsService.xiajia(id);
    }

}
