package com.xm.controller;

import com.xm.entity.SeckillGoods;
import com.xm.service.SeckillGoodsService;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SeckillGoodsController {

    @Resource
    private SeckillGoodsService seckillGoodsService;


    @RequestMapping("findSeckill")
    public List<SeckillGoods> findSeckill() {
        return seckillGoodsService.findSeckill();
    }

    @RequestMapping("addSeckill")
    public void addSeckill(@RequestBody SeckillGoods seckill) {
        seckillGoodsService.addSeckill(seckill);
    }

    @RequestMapping("deleteSeckill")
    public void deleteSeckill(@RequestParam Integer id) {
        seckillGoodsService.deleteSeckill(id);
    }

    @RequestMapping("updateSeckill")
    public SeckillGoods updateSeckill(@RequestParam Integer id) {
        return seckillGoodsService.updateSeckill(id);
    }
}
