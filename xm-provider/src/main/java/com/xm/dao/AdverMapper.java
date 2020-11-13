package com.xm.dao;

import com.xm.entity.Adver;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdverMapper {

    List<Adver> findAdver(Adver adver);

    void addAdver(Adver adver);

    void deleteAdver(Integer id);

    Adver findIdAdver(Integer id);

    void updateAdver(Adver adver);
}