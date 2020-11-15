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
    public List<SeckillGoods> findSeckill() {
        List<SeckillGoods> seckillList = (List<SeckillGoods>) redisUtil.get(RedisConstant.USER_LIST_KEY);
        if (seckillList == null || seckillList.isEmpty()) {
            seckillList = seckillGoodsService.findSeckill();
            redisUtil.set(RedisConstant.USER_LIST_KEY, seckillList);
            redisUtil.expire(RedisConstant.USER_LIST_KEY, 60);
        }
        return seckillList;
    }

    @RequestMapping("addSeckill")
    @ResponseBody
    public void addSeckill(SeckillGoods seckill,String imgname) {
        redisUtil.delAllKeys(RedisConstant.USER_LIST_KEY);
        seckillGoodsService.addSeckill(seckill,imgname);
    }

    @RequestMapping("deleteSeckill")
    @ResponseBody
    public void deleteSeckill(Integer id) {
        redisUtil.del(RedisConstant.USER_LIST_KEY);
        seckillGoodsService.deleteSeckill(id);
    }

    @RequestMapping("updateSeckill")
    @ResponseBody
    public SeckillGoods updateSeckill(Integer id) {
        return seckillGoodsService.updateSeckill(id);
    }
}
