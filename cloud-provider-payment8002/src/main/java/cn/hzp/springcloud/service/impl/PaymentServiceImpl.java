package cn.hzp.springcloud.service.impl;

import cn.hzp.springcloud.dao.PaymentDao;
import cn.hzp.springcloud.entities.Payment;
import cn.hzp.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname PaymentServiceImpl
 * @Description TODO
 * @Date 2020/3/12 11:51
 * @Created by HuZP
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }
}
