package com.xm.service.Impl;

import com.xm.dao.MemberMapper;
import com.xm.entity.Member;
import com.xm.entity.PageResult;
import com.xm.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public List<Member> find(Member member) {
        return memberMapper.find(member);
    }

    @Override
    public void getDelete(Integer id) {
        memberMapper.delete(id);
    }

    @Override
    public void add(Member member) {
       if(member.getId()!=null){
            memberMapper.update(member);
       }else{
            memberMapper.insertSelective(member);
       }
    }

    @Override
    public Member getUpdate(Integer id) {
        return memberMapper.selectByPrimaryKey(id);
    }
}
