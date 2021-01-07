package com.itshyt.springboot_quick.controller;

import com.itshyt.springboot_quick.model.MicroServiceUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
@Configuration
public class ConfigController {
    private final static Logger logger =
            LoggerFactory.getLogger(ConfigController.class);
    @Resource
    private MicroServiceUrl microServiceUrl;
//    @Value("${url.orderUrl}")
//    private String orderUrl;
    private String orderUrl;
    private String queryUrl;
    private String refundUrl;
    @RequestMapping("/orderUrl")
    public String order(){
        logger.info("订单url："+microServiceUrl.getOrderUrl());
        logger.info("查询url："+microServiceUrl.getQueryUrl());
        logger.info("退款url："+microServiceUrl.getRefundUrl());
       return "success" ;
    }

}
