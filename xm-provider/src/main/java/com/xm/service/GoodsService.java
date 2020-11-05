package com.xm.service;

import com.xm.entity.xmgoods;

import java.util.List;

public interface GoodsService {
    List<xmgoods> find();

    void delete(Integer id);

    void add(xmgoods po);

    xmgoods select(Integer id);
}
