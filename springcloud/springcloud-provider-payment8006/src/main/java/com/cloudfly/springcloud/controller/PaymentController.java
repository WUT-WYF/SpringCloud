package com.cloudfly.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author CloudFly
 * @create 2020-03-22 15:18
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping("/pay")
	public String pay(){
		return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
	}
}
