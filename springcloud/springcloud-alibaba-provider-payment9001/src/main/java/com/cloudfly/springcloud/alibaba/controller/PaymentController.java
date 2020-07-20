package com.cloudfly.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-05-22 22:37
 */
@RestController
public class PaymentController {
	@Value("${server.port}")
	private String serverPort;

	@GetMapping("/pay/{id}")
	public String pay(@PathVariable("id") Integer id) {
		return "端口号：" + serverPort + "，ID：" + id;
	}
}
