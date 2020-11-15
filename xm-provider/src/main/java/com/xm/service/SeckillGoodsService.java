package com.xm.service;

import com.xm.entity.SeckillGoods;

import java.util.List;

public interface SeckillGoodsService {

    List<SeckillGoods> findSeckill();

    void addSeckill(SeckillGoods seckill,String imgname);

    void deleteSeckill(Integer id);

    SeckillGoods updateSeckill(Integer id);
}
