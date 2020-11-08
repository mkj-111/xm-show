package com.xm.service;

import com.xm.entity.Member;
import com.xm.entity.PageResult;

import java.util.List;

public interface MemberService {
    List<Member> find(Member member);

    void getDelete(Integer id);

    void add(Member member);

    Member getUpdate(Integer id);
}
