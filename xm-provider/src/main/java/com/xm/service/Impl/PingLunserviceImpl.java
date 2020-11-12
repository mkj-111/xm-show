package com.xm.service.Impl;

import com.xm.dao.XmgoodsMapper;
import com.xm.entity.PingLunBean;
import com.xm.entity.xmgoods;
import com.xm.service.PingLunservice;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PingLunserviceImpl implements PingLunservice {

    @Resource
    private MongoTemplate mongotemplate;
    @Resource
    private XmgoodsMapper xmgoodsMapper;


    @Override
    public void insertq(Integer oid, String info) {
        PingLunBean p = new PingLunBean();
        Date time = new Date();
        long time1 = time.getTime();
        p.setPinglunId(time1 + "1");
        p.setCreateDate(time);
        p.setGoodsId(oid);
        p.setInfo(info);

        mongotemplate.save(p);
    }

}
