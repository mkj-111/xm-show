package com.xm.service.Impl;

import com.xm.dao.AfterMapper;
import com.xm.entity.After;
import com.xm.service.AfterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AfterServiceImpl implements AfterService {

    @Resource
    private AfterMapper afterMapper;

    @Override
    public List<After> find() {
        return afterMapper.find();
    }

    @Override
    public void getDelete(Integer id) {
        afterMapper.getDelete(id);
    }
}
