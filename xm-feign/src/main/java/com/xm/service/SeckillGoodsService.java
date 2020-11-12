package com.xm.service;

import com.xm.entity.SeckillGoods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "xmprovider")
public interface SeckillGoodsService {

    @RequestMapping("findSeckill")
    public List<SeckillGoods> findSeckill();

    @RequestMapping("addSeckill")
    public void addSeckill(@RequestBody SeckillGoods seckill);

    @RequestMapping("deleteSeckill")
    public void deleteSeckill(@RequestParam Integer id);

    @RequestMapping("updateSeckill")
    public SeckillGoods updateSeckill(@RequestParam Integer id);
}
