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


    /*于英彬*/
    //跳转会员列表页面
    @RequestMapping("member")
    public String member(){
        return "yyb/member";
    }
    //跳转会员等级页面
    @RequestMapping("rank")
    public String rank(){
        return "yyb/rank";
    }
    /*于英彬*/

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
    //跳转轮播管理页面
    @RequestMapping("content")
    public String content(){
        return "admin/Content";
    }



}
