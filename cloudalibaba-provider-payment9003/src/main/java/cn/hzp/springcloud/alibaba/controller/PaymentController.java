package cn.hzp.springcloud.alibaba.controller;

import cn.hzp.springcloud.entities.CommonResult;
import cn.hzp.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/3/19 16:43
 * @Created by HuZP
 */
@RestController
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long,Payment> hashMap = new HashMap<>();
    static
    {
        hashMap.put(1L,new Payment(1L,"9003111 "));
        hashMap.put(2L,new Payment(2L,"9003222"));
        hashMap.put(3L,new Payment(3L,"9003333"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id)
    {
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort:  "+serverPort,payment);
        return result;
    }
}