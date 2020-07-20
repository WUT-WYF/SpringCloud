package com.cloudfly.springcloud.service;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CloudFly
 * @create 2020-03-26 20:53
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/payment/get/{id}")
	public Result<Payment> getPaymentById(@PathVariable("id") Long id);

	/**
	 * 测试 OpenFeign 的超时控制
	 * @return
	 */
	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout();
}
