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
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
}
