package com.myfunnel.springcloud.service.impl;

import com.myfunnel.springcloud.dao.PaymentDao;
import com.myfunnel.springcloud.entities.Payment;
import com.myfunnel.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/4/4 - 15:46
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
