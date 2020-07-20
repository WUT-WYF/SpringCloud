package com.cloudfly.springcloud.alibaba.service;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import org.springframework.stereotype.Service;

/**
 * @author CloudFly
 * @create 2020-06-07 12:22
 */
@Service
public class PaymentFallbackService implements PaymentService{
	@Override
	public Result<Payment> pay(Long id) {
		return new Result<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
	}
}
