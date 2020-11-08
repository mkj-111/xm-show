package com.xm.service;

import com.xm.entity.Rank;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("xmprovider")
public interface RankService {

    @RequestMapping("rank/find")
    public List<Rank> find();

    @RequestMapping("rank/upgrade")
    public void upgrade(@RequestParam Integer id);
}
