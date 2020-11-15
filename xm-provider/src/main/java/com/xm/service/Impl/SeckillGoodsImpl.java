package com.xm.service.Impl;

import com.xm.dao.SeckillGoodsMapper;
import com.xm.entity.SeckillGoods;
import com.xm.service.SeckillGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SeckillGoodsImpl implements SeckillGoodsService {

    @Resource
    private SeckillGoodsMapper seckillGoodsMapper;

    @Override
    public List<SeckillGoods> findSeckill(SeckillGoods seckill) {
        return seckillGoodsMapper.findSeckill(seckill);
    }

    @Override
    public void addSeckill(SeckillGoods seckill) {
        if (seckill.getId() != null) {
            seckillGoodsMapper.updateGoods(seckill);
        } else {
            seckillGoodsMapper.addSeckill(seckill);
        }
    }

    @Override
    public void deleteSeckill(Integer id) {
        seckillGoodsMapper.deleteSeckill(id);
    }

    @Override
    public SeckillGoods updateSeckill(Integer id) {
        return seckillGoodsMapper.updateSeckill(id);
    }
}
