package com.xm.dao;

import com.xm.entity.xmorder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface xmorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(xmorder po);

    int insertSelective(xmorder record);

    xmorder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(xmorder record);

    int updateByPrimaryKey(xmorder po);

    List<xmorder> find(xmorder order);

    xmorder select(Integer id);


    List<xmorder> finddoctorBean();

    int selectUser(String name);

    int addUser(xmorder userInfo);

    int updateUser(xmorder userInfo);
}