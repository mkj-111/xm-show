package com.xm.controller;

import com.xm.entity.SysUser;
import com.xm.entity.xmtree;
import com.xm.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class usercontroller {

    @Resource
    private com.xm.service.UserService UserService;

    @RequestMapping("selectUserInfoByCode")
    public SysUser selectUserInfoByCode(@RequestParam String userCode) {
        return UserService.selectUserInfoByCode(userCode);
    }
    @RequestMapping("/selectTreeList")
    public List<xmtree> selectTreeList(@RequestParam Integer userId){
        return UserService.selectTreeList(userId);
    }

    @RequestMapping("/selectPowerKeyList")
    public List<String> selectPowerKeyList(@RequestParam Integer userId){
        return UserService.selectPowerKeyList(userId);
    }




}
