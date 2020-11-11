package com.xm.controller;

import com.xm.config.RedisConstant;
import com.xm.entity.Payment;
import com.xm.service.PaymentService;
import com.xm.utils.RedisUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("findpay")
    @ResponseBody
    public List<Payment> findPay(){
        List<Payment> paymentList= (List<Payment>) redisUtil.get(RedisConstant.PAY_LIST_KEY);
        if(paymentList==null || paymentList.isEmpty()){
            paymentList=paymentService.findPay();
            redisUtil.set(RedisConstant.PAY_LIST_KEY,paymentList);
            redisUtil.expire(RedisConstant.PAY_LIST_KEY,60);
        }
        return paymentList;
    }

    @RequestMapping("deletepay")
    @ResponseBody
    public void delete(@RequestParam Integer id){
        redisUtil.del(RedisConstant.PAY_LIST_KEY);
        paymentService.delete(id);
    }
}
