package com.xm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class jumpcontroller {



    //跳转树页面index
    @RequestMapping("index")
    public String index(){
        return "index";
    }

    //跳转登录页面
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    //跳转首页面
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
    //跳转产品管理页面
    @RequestMapping("goods")
    public String goods(){
        return "admin/Goods";
    }
    //跳转订单管理页面
    @RequestMapping("order")
    public String order(){
        return "admin/Order";
    }
    //跳转产品管理页面
    @RequestMapping("text")
    public String text(){
        return "text";
    }
}
