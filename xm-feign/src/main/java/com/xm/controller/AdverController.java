package com.xm.controller;

import com.xm.entity.Adver;
import com.xm.service.AdverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AdverController {

    @Resource
    private AdverService adverService;

    @RequestMapping("findAdver")
    @ResponseBody
    public List<Adver> findAdver(Adver adver){
        return adverService.findAdver(adver);
    }

    @RequestMapping("addAdver")
    @ResponseBody
    public void addAdver(Adver adver){
        adverService.addAdver(adver);
    }

    @RequestMapping("deleteAdver")
    @ResponseBody
    public void deleteAdver(Integer id){
        adverService.deleteAdver(id);
    }

    @RequestMapping("findIdAdver")
    @ResponseBody
    public Adver findIdAdver(Integer id){
        return adverService.findIdAdver(id);
    }


}
