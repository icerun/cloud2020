package com.myfunnel.springcloud.service;

import com.myfunnel.springcloud.entities.Payment;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/4/4 - 15:45
 */
public interface PaymentService {
    /**
     *
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     *
     * @param id
     * @return
     */
    public Payment getPaymentById(Long id );
}
