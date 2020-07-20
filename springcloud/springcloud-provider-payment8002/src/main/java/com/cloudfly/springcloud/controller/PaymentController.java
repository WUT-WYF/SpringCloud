package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import com.cloudfly.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author CloudFly
 * @create 2020-03-14 18:09
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@PostMapping("/create")
	public Result create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("*****插入结果：" + result);
		if (result > 0) {
			return new Result(200, "插入成功，serverPort：" + serverPort, result);
		} else {
			return new Result(444, "插入失败", null);
		}
	}

	@GetMapping("/get/{id}")
	public Result getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		log.info("*****查询结果：" + payment);
		if (payment != null) {
			return new Result(200, "查询成功，serverPort：" + serverPort, payment);
		} else {
			return new Result(444, "查询ID：" + id + "，无记录", null);
		}
	}
}
