package com.xm.dao;

import com.xm.entity.xmgoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface XmgoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(xmgoods po);

    int insertSelective(xmgoods record);

    xmgoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(xmgoods record);

    int updateByPrimaryKey(xmgoods po);

    List<xmgoods> find();

    xmgoods select(Integer id);
}