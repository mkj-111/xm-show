package com.xm.dao;

import com.xm.entity.SeckillGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SeckillGoodsMapper {

    List<SeckillGoods> findSeckill(SeckillGoods seckill);

    void addSeckill(SeckillGoods seckill);

    void deleteSeckill(Integer id);

    SeckillGoods updateSeckill(Integer id);

    void updateGoods(SeckillGoods seckill);
}