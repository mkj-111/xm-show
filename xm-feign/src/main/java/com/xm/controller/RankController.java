package com.xm.controller;

import com.xm.entity.Rank;
import com.xm.service.RankService;
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

    /**
     * 查询
     * @return
     */
    @RequestMapping("find")
    @ResponseBody
    public List<Rank> find(){
        return rankService.find();
    }

    /**
     * 升级
     * @param id
     */
    @RequestMapping("upgrade")
    @ResponseBody
    public void upgrade(@RequestParam Integer id){
        rankService.upgrade(id);
    }
}
