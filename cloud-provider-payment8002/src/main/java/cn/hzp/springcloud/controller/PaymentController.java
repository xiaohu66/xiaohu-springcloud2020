package cn.hzp.springcloud.controller;

import cn.hzp.springcloud.entities.CommonResult;
import cn.hzp.springcloud.entities.Payment;
import cn.hzp.springcloud.service.PaymentService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.security.auth.login.LoginContext;

/**
 * @Classname PaymentController
 * @Description TODO
 * @Date 2020/3/12 11:53
 * @Created by HuZP
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("******插入结果"+result);

        if(result>0){
            return new CommonResult(200,"插入数据库成功"+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库错误",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("******插入结果"+payment);

        if(payment!=null){
            return new CommonResult<Payment>(200,"查询成功"+serverPort,payment);
        }else{
            return new CommonResult<Payment>(444,"查询失败",null);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
