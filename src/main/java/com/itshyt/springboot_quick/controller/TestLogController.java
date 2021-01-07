package com.itshyt.springboot_quick.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestLogController {
    private final static Logger logger =
            LoggerFactory.getLogger(TestLogController.class);
    @RequestMapping("/log")
    public void logger(){
        logger.info("日志打印");
        logger.info("日志打印1");
        logger.info("日志打印2");
        logger.info("日志打印3");
        logger.error("错误日志打印");
        logger.debug("断点日志打印");
        logger.warn("警告日志打印");
    }
}
