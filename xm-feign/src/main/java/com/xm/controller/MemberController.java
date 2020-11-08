package com.xm.controller;

import com.xm.entity.Member;
import com.xm.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MemberController {

    @Resource
    private MemberService memberService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("select")
    @ResponseBody
    public List<Member> find(Member member){
        return memberService.find(member);
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("getDelete")
    @ResponseBody
    public void getDelete(Integer id){
        memberService.getDelete(id);
    }

    /**
     * 新增
     * @param member
     */
    @RequestMapping("add")
    @ResponseBody
    public void add(Member member){
        memberService.add(member);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("getUpdate")
    @ResponseBody
    public Member getUpdate(Integer id){
        return memberService.getUpdate(id);
    }
}
