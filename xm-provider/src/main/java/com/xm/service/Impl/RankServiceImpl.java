package com.xm.service.Impl;

import com.xm.dao.RankMapper;
import com.xm.entity.Rank;
import com.xm.service.RankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RankServiceImpl implements RankService {

    @Resource
    private RankMapper rankMapper;
    @Override
    public List<Rank> find() {
        return rankMapper.find();
    }

    @Override
    public void upgrade(Integer id) {
        rankMapper.upgrade(id);
    }
}
