package com.xm.controller;

import com.xm.entity.xmtree;
import com.xm.service.TreeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TreeController {

    @Resource
    private TreeService treeService;

    @RequestMapping("findtree")
    public List<xmtree> findtree(){
        return treeService.findtree();
    }
}
