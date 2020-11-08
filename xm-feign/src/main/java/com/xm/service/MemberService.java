package com.xm.service;

import com.xm.entity.Member;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="xmprovider")
public interface MemberService {

    @RequestMapping("selectyyb")
    public List<Member> find(@RequestBody Member member);


    @RequestMapping("getDeleteyyb")
    public void getDelete(@RequestParam Integer id);

    @RequestMapping("addyyb")
    public void add(@RequestBody Member member);

    @RequestMapping("getUpdateyyb")
    public Member getUpdate(@RequestParam Integer id);
}
