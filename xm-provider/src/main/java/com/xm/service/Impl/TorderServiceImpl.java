package com.xm.service.Impl;

import com.xm.dao.TorderMapper;
import com.xm.entity.TorderVo;
import com.xm.service.TorderSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TorderServiceImpl  implements TorderSrevice {
    @Autowired
    private TorderMapper torderMapper;
    @Override
    public List<TorderVo> highcharts() {

        return torderMapper.highcharts();
    }
}
