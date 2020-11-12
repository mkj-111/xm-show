package com.xm.service.Impl;

import com.xm.dao.AreaMapper;
import com.xm.entity.Area;
import com.xm.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private com.xm.dao.AreaMapper areaMapper;

    @Override
    public List<Area> areafindll() {
        return areaMapper.areafindll();
    }
}
