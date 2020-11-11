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
    //跳转售后管理页面
    @RequestMapping("after")
    public String after(){
        return "yyb/after";
    }
    //跳转支付方式页面
    @RequestMapping("payment")
    public String payment(){
        return "yyb/payment";
    }
    //跳转秒杀页面
    @RequestMapping("seckill")
    public String seckill(){
        return "yyb/seckillGoods";
    }
    //跳转首页
    @RequestMapping("first")
    public String first(){
        return "first";
    }
    //跳转欢迎页面
    @RequestMapping("second")
    public String second(){
        return "second";
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
}
