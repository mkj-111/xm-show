package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.xmgoods;
import com.xm.service.GoodsService;
import com.xm.utils.FileUtil;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("find")
    @ResponseBody
    public List<xmgoods>find(xmgoods goods){
        List<xmgoods> goodsList= (List<xmgoods>) redisUtil.get(RedisConstant.GOODS_LIST_KEY);
        if(goodsList==null || goodsList.isEmpty()){
            goodsList=goodsService.find(goods);
            redisUtil.set(RedisConstant.GOODS_LIST_KEY,goodsList);
            redisUtil.expire(RedisConstant.GOODS_LIST_KEY,60);
        }
        return goodsService.find(goods);
    }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id) {
        redisUtil.del(RedisConstant.GOODS_LIST_KEY);
        goodsService.delete(id);
    }

    @RequestMapping("add")
    @ResponseBody
    public void insert(xmgoods po) {
        redisUtil.delAllKeys(RedisConstant.GOODS_LIST_KEY);
        goodsService.add(po);
    }

    @RequestMapping("huixian")
    @ResponseBody
    public xmgoods selectId(Integer id){
        redisUtil.del(RedisConstant.GOODS_LIST_KEY);
        return goodsService.select(id);
    }

    @RequestMapping("tu")
    @ResponseBody
    public String uploadImg(MultipartFile imgfile, HttpServletRequest request) throws IllegalStateException, IOException {
        return FileUtil.uploadFile(imgfile, request);
    }


}
