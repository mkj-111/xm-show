package com.xm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 毛康健
 * @description
 * @create 2020/11/1
 */
@Controller
@RequestMapping("test")
public class test {

    @RequestMapping("toindex")
    public String toindex(){
        return "test";
    }
}
