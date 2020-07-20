package com.cloudfly.springcloud.alibaba.controller;

import com.cloudfly.springcloud.alibaba.service.PaymentService;
import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author CloudFly
 * @create 2020-06-07 12:26
 */
@RestController
public class OrderController {
	@Resource
	private PaymentService paymentService;

	@GetMapping(value = "/order/{id}")
	public Result<Payment> order(@PathVariable("id") Long id) {
		return paymentService.pay(id);
	}
}
