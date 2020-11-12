package com.xm.dao;

import com.xm.entity.TorderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TorderMapper {
    List<TorderVo> highcharts();
}
