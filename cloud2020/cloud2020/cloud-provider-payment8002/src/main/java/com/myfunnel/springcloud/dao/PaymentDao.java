package com.myfunnel.springcloud.dao;

import com.myfunnel.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/4/4 - 14:23
 */
@Mapper
public interface PaymentDao {
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
    public Payment getPaymentById(@Param("id") Long id);
}
