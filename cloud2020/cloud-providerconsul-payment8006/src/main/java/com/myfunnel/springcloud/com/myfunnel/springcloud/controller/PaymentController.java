package com.myfunnel.springcloud.com.myfunnel.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/6/20 - 17:32
 */
@RestController
@Slf4j
public class PaymentController {
    /**
     * 从配置文件中读取服务端口
     */
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentconsul() {
        String randomCode = "Spring cloud with consul port:" + serverPort + "\t" + UUID.randomUUID().toString();
        System.out.println("支付流水号randomCode:" + randomCode);
        return randomCode;
    }
}
