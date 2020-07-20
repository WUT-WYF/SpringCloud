package com.cloudfly.springcloud.alibaba.service;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CloudFly
 * @create 2020-06-07 12:20
 */
@FeignClient(value = "springcloud-alibaba-payment-service", fallback = PaymentFallbackService.class)
public interface PaymentService {
	@GetMapping("/pay/{id}")
	public Result<Payment> pay(@PathVariable("id") Long id);
}
