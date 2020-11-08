package com.xm.controller;


import com.xm.entity.Member;
import com.xm.entity.PageResult;
import com.xm.service.MemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MemberController {

    @Resource
    private MemberService memberService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("selectyyb")
    public List<Member> find(@RequestBody Member member){
        return memberService.find(member);
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("getDeleteyyb")
    public void getDelete(@RequestParam Integer id){
        memberService.getDelete(id);
    }

    /**
     * 新增
     * @param member
     */
    @RequestMapping("addyyb")
    public void add(@RequestBody Member member){
        memberService.add(member);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("getUpdateyyb")
    public Member getUpdate(@RequestParam Integer id){
        return memberService.getUpdate(id);
    }
}
