package com.xm.service;

import com.xm.entity.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> find();

    void delete(Integer id);
}
