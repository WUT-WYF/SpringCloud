package com.cloudfly.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author CloudFly
 * @create 2020-05-23 14:49
 */
@RestController
public class OrderController {
	@Resource
	private RestTemplate restTemplate;

	@Value("${service-url.nacos-service}")
	private String serverURL;

	@GetMapping("/order/{id}")
	public String order(@PathVariable("id") Integer id) {
		return restTemplate.getForObject(serverURL + "/pay/" + id, String.class);
	}
}
