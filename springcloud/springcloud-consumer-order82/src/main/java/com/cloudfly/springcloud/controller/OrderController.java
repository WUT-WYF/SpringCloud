package com.cloudfly.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author CloudFly
 * @create 2020-03-21 12:26
 */
@RestController
@Slf4j
public class OrderController {
	public static final String INVOME_URL = "http://springcloud-payment-service";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/order")
	public String order(){
		String result = restTemplate.getForObject(INVOME_URL+"/payment/pay",String.class);
		return result;
	}
}
