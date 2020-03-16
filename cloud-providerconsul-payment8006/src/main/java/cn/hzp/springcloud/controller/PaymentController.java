package cn.hzp.springcloud.controller;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/3/13 10:50
 * @Created by HuZP
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String payment(){
        return "SpringCloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}