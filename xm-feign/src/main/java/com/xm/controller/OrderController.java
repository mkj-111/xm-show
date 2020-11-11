package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.xmorder;
import com.xm.service.OrderService;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("find")
    @ResponseBody
    public List<xmorder>find(xmorder order){
        List<xmorder> orderList= (List<xmorder>) redisUtil.get(RedisConstant.ORDER_LIST_KEY);
        if(orderList ==null || orderList.isEmpty()){
            orderList=orderService.find(order);
            redisUtil.set(RedisConstant.ORDER_LIST_KEY,orderList);
            redisUtil.expire(RedisConstant.ORDER_LIST_KEY,60);
        }
        return orderList;
    }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id) {
        redisUtil.del(RedisConstant.ORDER_LIST_KEY);
        orderService.delete(id);
    }

    @RequestMapping("add")
    @ResponseBody
    public void insert(xmorder po) {
        redisUtil.delAllKeys(RedisConstant.ORDER_LIST_KEY);
        orderService.add(po);
    }

    @RequestMapping("huixian")
    @ResponseBody
    public xmorder selectId(Integer id){
        redisUtil.del(RedisConstant.ORDER_LIST_KEY);
        return orderService.select(id);
    }
    //导出
    @RequestMapping("exportBank")
    @ResponseBody
    public void exportBank(HttpServletResponse response){
        orderService.exportBank(response);
    }

    @RequestMapping("importstudent")
    public String excelImport(MultipartFile[] file, HttpSession session) {
        return orderService.excelImport(file,session);
    }

}
