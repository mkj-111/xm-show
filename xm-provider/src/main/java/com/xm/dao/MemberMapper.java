package com.xm.dao;

import com.xm.entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
    int insertSelective(Member member);

    Member selectByPrimaryKey(Integer id);

    List<Member> find(Member member);

    void delete(Integer id);

    void update(Member member);
}