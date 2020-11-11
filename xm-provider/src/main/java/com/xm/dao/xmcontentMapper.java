package com.xm.dao;

import com.xm.entity.xmcontent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface xmcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(xmcontent po);

    int insertSelective(xmcontent record);

    xmcontent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(xmcontent record);

    int updateByPrimaryKey(xmcontent po);

    List<xmcontent> findw();

    xmcontent select(Integer id);

    void add1(List<xmcontent> list);
}