package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.After;
import com.xm.service.AfterService;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AfterController {

    @Resource
    private AfterService afterService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("yybfind")
    @ResponseBody
    public List<After> find() {
        List<After> afterList = (List<After>) redisUtil.get(RedisConstant.AFTER_LIST_KEY);
        if (afterList == null || afterList.isEmpty()) {
            afterList = afterService.find();
            redisUtil.set(RedisConstant.AFTER_LIST_KEY, afterList);
            redisUtil.expire(RedisConstant.AFTER_LIST_KEY, 60);
        }
        return afterList;
    }

    @RequestMapping("yybgetDelet")
    @ResponseBody
    public void yybgetDelete(Integer id) {
        redisUtil.del(RedisConstant.AFTER_LIST_KEY);
        afterService.yybgetDelete(id);
    }
}
