package com.xm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class jumpcontroller {

    //跳转登录页面
    @RequestMapping("mi")
    public String mi(){
        return "mi";
    }
    //跳转首页页面
    @RequestMapping("guan")
    public String guan(){
        return "guan";
    }
    //跳转树页面index
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    //跳转树页面index
    @RequestMapping("index1")
    public String index1(){
        return "index1";
    }

    @RequestMapping("main")
    public String main(){
        return "main_page";
    }
    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
