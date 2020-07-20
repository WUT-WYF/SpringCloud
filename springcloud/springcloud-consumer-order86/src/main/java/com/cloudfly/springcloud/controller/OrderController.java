package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import com.cloudfly.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-03-26 20:58
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private PaymentFeignService paymentFeignService;

	@GetMapping(value = "/get/{id}")
	public Result<Payment> getPaymentById(@PathVariable("id")Long id){
		return paymentFeignService.getPaymentById(id);
	}

	/**
	 * 测试 OpenFeign 的超时控制
	 * @return
	 */
	@GetMapping(value = "/feign/timeout")
	public String paymentFeignTimeout(){
		return paymentFeignService.paymentFeignTimeout();
	}
}
