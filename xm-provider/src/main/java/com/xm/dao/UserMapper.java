package com.xm.dao;

import com.xm.entity.SysUser;
import com.xm.entity.xmtree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    SysUser selectUserInfoByCode(String userCode);

    List<xmtree> selectTreeList(Integer pid, Integer userId);

    List<String> selectPowerKeyList(Integer userId);


}
