package com.xm.service.Impl;

import com.xm.dao.AdverMapper;
import com.xm.entity.Adver;
import com.xm.service.AdverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdverServiceImpl implements AdverService {

    @Resource
    private AdverMapper adverMapper;


    @Override
    public List<Adver> findAdver(Adver adver) {
        return adverMapper.findAdver(adver);
    }

    @Override
    public void addAdver(Adver adver) {
        if(adver.getId()!=null){
            adverMapper.updateAdver(adver);
        }else{
            adverMapper.addAdver(adver);
        }
    }

    @Override
    public void deleteAdver(Integer id) {
        adverMapper.deleteAdver(id);
    }

    @Override
    public Adver findIdAdver(Integer id) {
        return adverMapper.findIdAdver(id);
    }


}
