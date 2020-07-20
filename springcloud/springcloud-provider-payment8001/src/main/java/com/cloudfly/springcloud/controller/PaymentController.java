package com.cloudfly.springcloud.controller;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import com.cloudfly.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

	@Autowired
	private DiscoveryClient discoveryClient;

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

	@GetMapping(value = "/discovery")
	public Object discovery() {
		List<String> services = discoveryClient.getServices();
		for (String element : services) {
			log.info("***** element:" + element);
		}
		List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PAYMENT-SERVICE");
		for (ServiceInstance instance : instances) {
			log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
		}
		return this.discoveryClient;
	}

	/**
	 * 测试 OpenFeign 的超时控制
	 *
	 * @return
	 */
	@GetMapping(value = "/feign/timeout")
	public String paymentFeignTimeout() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serverPort;
	}
}
