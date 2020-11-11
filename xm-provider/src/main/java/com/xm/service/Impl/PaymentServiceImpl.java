package com.xm.service.Impl;

import com.xm.dao.PaymentMapper;
import com.xm.entity.Payment;
import com.xm.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public List<Payment> find() {
        return paymentMapper.find();
    }

    @Override
    public void delete(Integer id) {
        paymentMapper.delete(id);
    }
}
