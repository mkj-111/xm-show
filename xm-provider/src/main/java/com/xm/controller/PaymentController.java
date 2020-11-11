package com.xm.controller;

import com.xm.entity.Payment;
import com.xm.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 查询
     * @return
     */
    @RequestMapping("findpay")
    public List<Payment> findPay(){
        return paymentService.find();
    }

    @RequestMapping("deletepay")
    public void delete(@RequestParam Integer id){
        paymentService.delete(id);
    }
}
