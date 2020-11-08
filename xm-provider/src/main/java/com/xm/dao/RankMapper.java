package com.xm.dao;

import com.xm.entity.Rank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RankMapper {
    List<Rank> find();

    void upgrade(Integer id);
}
