package com.xm.dao;

import com.xm.entity.Order;
import com.xm.entity.xmorder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> find();

    List<xmorder> finddoctorBean();

    Order select(Integer id);
}