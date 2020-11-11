package com.xm.service;


import com.xm.entity.SysUser;
import com.xm.entity.xmtree;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    SysUser selectUserInfoByCode(String userCode);

    List<xmtree> selectTreeList(Integer userId);

    List<String> selectPowerKeyList(Integer userId);

}
