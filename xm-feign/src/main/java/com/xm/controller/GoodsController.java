package com.xm.controller;

import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;
import com.xm.utils.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {

@Resource
    private GoodsService goodsService;

@RequestMapping("find")
@ResponseBody
    public List<xmgoods>find(){
    return goodsService.find();
}
    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id) {
        goodsService.delete(id);
    }
    @RequestMapping("add")
    @ResponseBody
    public void insert(xmgoods po) {
        goodsService.add(po);
    }
    @RequestMapping("huixian")
    @ResponseBody
    public xmgoods selectId(Integer id){

        return goodsService.select(id);
    }
    @RequestMapping("tu")
    @ResponseBody
    public String uploadImg(MultipartFile imgfile, HttpServletRequest request) throws IllegalStateException, IOException {
        return FileUtil.uploadFile(imgfile, request);
    }


}
