package com.xm.dao;

import com.xm.entity.After;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AfterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(After record);

    int insertSelective(After record);

    After selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(After record);

    int updateByPrimaryKey(After record);

    List<After> find();

    void getDelete(Integer id);
}