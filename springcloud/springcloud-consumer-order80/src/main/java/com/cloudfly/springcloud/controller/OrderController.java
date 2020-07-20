package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author CloudFly
 * @create 2020-03-14 18:09
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {

	public static final String PAYMENT_URL = "http://SPRINGCLOUD-PAYMENT-SERVICE";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/create")
	public Result<Payment> create(Payment payment) {
		// return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, Result.class);

		return restTemplate.postForEntity(PAYMENT_URL + "/payment/create", payment, Result.class).getBody();
	}

	@GetMapping("/get/{id}")
	public Result<Payment> getPayment(@PathVariable("id") Long id) {
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, Result.class);
	}

	@GetMapping("/getForEntity/{id}")
	public Result<Payment> getForEntity(@PathVariable("id") Long id) {
		ResponseEntity<Result> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, Result.class);

		if (entity.getStatusCode().is2xxSuccessful()){
			return entity.getBody();
		}else{
			return new Result<>(444,"操作失败！");
		}
	}
}