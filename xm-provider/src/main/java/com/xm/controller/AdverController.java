package com.xm.controller;

import com.xm.entity.Adver;
import com.xm.service.AdverService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdverController {

    @Resource
    private AdverService adverService;

    @RequestMapping("findAdver")
    public List<Adver> findAdver(@RequestBody Adver adver){
        return adverService.findAdver(adver);
    }

    @RequestMapping("addAdver")
    public void addAdver(@RequestBody Adver adver){
        adverService.addAdver(adver);
    }

    @RequestMapping("deleteAdver")
    public void deleteAdver(@RequestParam Integer id){
        adverService.deleteAdver(id);
    }

    @RequestMapping("findIdAdver")
    public Adver findIdAdver(@RequestParam Integer id){
        return adverService.findIdAdver(id);
    }
}
