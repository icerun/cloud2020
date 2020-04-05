package com.myfunnel.springcloud.controller;

import com.myfunnel.springcloud.entities.CommonResult;
import com.myfunnel.springcloud.entities.Payment;
import com.myfunnel.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/4/4 - 15:48
 */
@RestController
@Slf4j
public class PaymentController {


    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 支付数据插入
     * @param payment
     * @return
     */
    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0 ){
            log.info("*********插入结果：" + result);
            return new CommonResult("200","插入数据成功,端口："+serverPort,result);
        }else{
             return new CommonResult("444","插入数据失败",result);
        }
    }

    /**
     * 根据id查询支付流水号
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id ){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*********查询结果：" + payment);
        if(payment != null){
            return new CommonResult("200","查询成功,端口："+serverPort,payment);
        }else {
            return new CommonResult("444","没有对应记录，查询失败："+id,null);
        }
    }
}
