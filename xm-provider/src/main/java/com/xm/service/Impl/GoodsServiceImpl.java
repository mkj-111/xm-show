package com.xm.service.Impl;

import com.xm.dao.XmgoodsMapper;
import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private XmgoodsMapper xmgoodsMapper;

    @Override
    public List<xmgoods> find(xmgoods goods) {

        return xmgoodsMapper.find(goods);

    }

    @Override
    public void delete(Integer id) {
        xmgoodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(xmgoods po) {
        if (po.getId() != null) {
            xmgoodsMapper.updateByPrimaryKey(po);
        } else {
            xmgoodsMapper.insert(po);
        }
    }

    @Override
    public xmgoods select(Integer id) {
        return xmgoodsMapper.select(id);
    }


}
