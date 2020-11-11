package com.xm.service;

import com.xm.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="xmprovider")
public interface PaymentService {

    @RequestMapping("findpay")
    public List<Payment> findPay();

    @RequestMapping("deletepay")
    public void delete(@RequestParam Integer id);
}
