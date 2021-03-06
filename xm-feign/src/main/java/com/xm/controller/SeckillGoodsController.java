package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.SeckillGoods;
import com.xm.service.SeckillGoodsService;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SeckillGoodsController {

    @Resource
    private SeckillGoodsService seckillGoodsService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("findSeckill")
    @ResponseBody
    public List<SeckillGoods> findSeckill(SeckillGoods seckill) {
        return seckillGoodsService.findSeckill(seckill);
    }

    @RequestMapping("addSeckill")
    @ResponseBody
    public void addSeckill(SeckillGoods seckill) {
        seckillGoodsService.addSeckill(seckill);
    }

    @RequestMapping("deleteSeckill")
    @ResponseBody
    public void deleteSeckill(Integer id) {
        seckillGoodsService.deleteSeckill(id);
    }

    @RequestMapping("updateSeckill")
    @ResponseBody
    public SeckillGoods updateSeckill(Integer id) {
        return seckillGoodsService.updateSeckill(id);
    }

    
}
