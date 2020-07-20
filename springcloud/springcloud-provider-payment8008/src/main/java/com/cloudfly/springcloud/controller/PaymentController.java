package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-03-28 19:18
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	/**
	 * 成功
	 *
	 * @param id
	 * @return
	 */
	@GetMapping("/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo_OK(id);
		log.info("*****result：" + result);
		return result;
	}

	/**
	 * 失败 服务降级
	 *
	 * @param id
	 * @return
	 */
	@GetMapping("/timeout/{id}")
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo_TimeOut(id);
		log.info("*****result：" + result);
		return result;
	}

	/**
	 * 服务熔断
	 *
	 * @param id
	 * @return
	 */
	@GetMapping("/circuit/{id}")
	public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
		String result = paymentService.paymentCircuitBreaker(id);
		log.info("*****result：" + result);
		return result;
	}
}
