package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.Member;
import com.xm.service.MemberService;
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
public class MemberController {

    @Resource
    private MemberService memberService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    /**
     * 查询
     * @return
     */
    @RequestMapping("selectyyb")
    @ResponseBody
    public List<Member> find(Member member){
        List<Member> memberList= (List<Member>) redisUtil.get(RedisConstant.MEMBER_LIST_KEY);
        if(memberList==null || memberList.isEmpty()){
            memberList=memberService.find(member);
            redisUtil.set(RedisConstant.MEMBER_LIST_KEY,memberList);
            redisUtil.expire(RedisConstant.MEMBER_LIST_KEY,60);
        }
        return memberList;
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping("getDeleteyyb")
    @ResponseBody
    public void getDelete(Integer id){
        redisUtil.del(RedisConstant.MEMBER_LIST_KEY);
        memberService.getDelete(id);
    }

    /**
     * 新增
     * @param member
     */
    @RequestMapping("addyyb")
    @ResponseBody
    public void add(Member member){
        redisUtil.delAllKeys(RedisConstant.MEMBER_LIST_KEY);
        memberService.add(member);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("getUpdateyyb")
    @ResponseBody
    public Member getUpdate(Integer id){
        redisUtil.del(RedisConstant.MEMBER_LIST_KEY);
        return memberService.getUpdate(id);
    }
}
