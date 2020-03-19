package cn.hzp.springcloud.alibaba.service;

import cn.hzp.springcloud.entities.CommonResult;
import cn.hzp.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Classname PaymentService
 * @Description TODO
 * @Date 2020/3/19 16:56
 * @Created by HuZP
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService
{
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}

