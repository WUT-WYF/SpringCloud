package com.cloudfly.springcloud.controller;

/**
 * @author CloudFly
 * @create 2020-03-22 18:04
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {
	public static final String INVOME_URL = "http://springcloud-payment-service";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/order")
	public String order (){
		String result = restTemplate.getForObject(INVOME_URL+"/payment/pay",String.class);
		return result;
	}
}
