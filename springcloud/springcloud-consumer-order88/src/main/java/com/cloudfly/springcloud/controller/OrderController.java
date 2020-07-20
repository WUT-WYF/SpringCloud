package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-03-30 21:25
 */
@RestController
@Slf4j
@RequestMapping("/order")
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")  //全局的服务降级
public class OrderController {
	@Autowired
	private PaymentService paymentService;

	@GetMapping("/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo_OK(id);
		return result;
	}

	@GetMapping("/timeout/{id}")
//	指定具体的服务降级方法
//	@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
//			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//	})
	@HystrixCommand
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
		// 模拟程序错误
		int a = 5 / 0;

		String result = paymentService.paymentInfo_TimeOut(id);
		return result;
	}

	public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id) {
		return "订单系统错误或支付信息繁忙";
	}

	// 默认的全局服务降级
	public String payment_Global_FallbackMethod(){
		return "Global异常处理信息，请稍后再试";
	}
}
