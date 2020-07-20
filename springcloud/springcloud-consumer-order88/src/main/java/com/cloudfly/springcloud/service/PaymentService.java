package com.cloudfly.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CloudFly
 * @create 2020-03-30 21:22
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PAYMENT-SERVICE",fallback = PaymentFallbackService.class)
public interface PaymentService {
	@GetMapping("/payment/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id);

	@GetMapping("/payment/timeout/{id}")
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
