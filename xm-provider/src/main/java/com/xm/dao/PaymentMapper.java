package com.xm.dao;

import com.xm.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {

    List<Payment> find();

    void delete(Integer id);
}