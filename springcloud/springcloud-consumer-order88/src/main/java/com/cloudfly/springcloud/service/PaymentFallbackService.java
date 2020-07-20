package com.cloudfly.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author CloudFly
 * @create 2020-04-06 21:31
 */
@Component
public class PaymentFallbackService implements PaymentService {
	@Override
	public String paymentInfo_OK(Integer id) {
		return "PaymentFallbackService paymentInfo_OK fall back";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "PaymentFallbackService paymentInfo_TimeOut fall back";
	}
}
