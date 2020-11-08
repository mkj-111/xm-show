package com.xm.service;

import com.xm.entity.Rank;

import java.util.List;

public interface RankService {
    List<Rank> find();

    void upgrade(Integer id);
}
