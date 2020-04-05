package com.myfunnel.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shenshix
 * @version 1.0
 * @Date 2020/4/5 - 9:38
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001.class,args);
    }
}
