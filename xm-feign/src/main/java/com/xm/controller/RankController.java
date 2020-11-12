package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.Rank;
import com.xm.service.RankService;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class RankController {

    @Resource
    private RankService rankService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    /**
     * 查询
     *
     * @return
     */
    @RequestMapping("findyyb")
    @ResponseBody
    public List<Rank> find() {
        List<Rank> rankList = (List<Rank>) redisUtil.get(RedisConstant.RANK_LIST_KEY);
        if (rankList == null || rankList.isEmpty()) {
            rankList = rankService.find();
            redisUtil.set(RedisConstant.RANK_LIST_KEY, rankList);
            redisUtil.expire(RedisConstant.RANK_LIST_KEY, 60);
        }
        return rankList;
    }

    /**
     * 升级
     *
     * @param id
     */
    @RequestMapping("upgradeyyb")
    @ResponseBody
    public void upgrade(@RequestParam Integer id) {
        redisUtil.del(RedisConstant.RANK_LIST_KEY);
        rankService.upgrade(id);
    }
}
