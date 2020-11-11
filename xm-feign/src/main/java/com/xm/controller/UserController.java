package com.xm.controller;

import com.xm.entity.SysUser;
import com.xm.entity.xmtree;
import com.xm.service.Userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

private Logger log= LoggerFactory.getLogger(UserController.class);

@Resource
    private com.xm.service.Userservice Userservice;

@RequestMapping("selectUserInfoByCode")
public SysUser selectUserInfoByCode(@RequestParam String userCode){
    return Userservice.selectUserInfoByCode(userCode);
}
    @RequestMapping("login")
    @ResponseBody
    public String login(SysUser user){
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken upt=new UsernamePasswordToken(user.getUsercode(),user.getPassword());
        try {
            subject.login(upt);
            log.info("登录成功");
            return "成功";
        }catch (UnknownAccountException uae){
            log.info("帐号不存在");
            return "账号不存在";

        }catch (IncorrectCredentialsException ice){
            log.info("密码错误");
            return "密码错误";

        }catch (AuthenticationException ae){
            log.info("网路异常");
            return "网路异常";
        }
    }
    @RequestMapping("/queryTree")
    @ResponseBody
    public List<xmtree> queryTree() {
        System.out.println("登录成功");
        //查询当前用户所属的权限树
        SysUser user = (SysUser)SecurityUtils.getSubject().getPrincipal();
        return Userservice.selectTreeList(user.getId());
    }

    @RequestMapping("/queryUser")
    @RequiresPermissions("user:create")
    public String queryUser() {
        return "userList";
    }


}
