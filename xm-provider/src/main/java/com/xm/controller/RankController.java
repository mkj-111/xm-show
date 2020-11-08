package com.xm.controller;

import com.xm.entity.Rank;
import com.xm.service.RankService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("rank")
public class RankController {

    @Resource
    private RankService rankService;

    /**
     * 等级查询
     * @return
     */
    @RequestMapping("find")
    public List<Rank> find(){
        return rankService.find();
    }

    /**
     * 升级
     * @param id
     */
    @RequestMapping("upgrade")
    public void upgrade(@RequestParam Integer id){
        rankService.upgrade(id);
    }
}
