package com.cloudfly.springcloud.alibaba.controller;

import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author CloudFly
 * @create 2020-05-22 22:37
 */
@RestController
public class PaymentController {
	@Value("${server.port}")
	private String serverPort;

	/**
	 * 模拟数据库
	 */
	public static HashMap<Integer, Payment> hashMap = new HashMap<>();

	static {
		hashMap.put(1, new Payment(1L, "28a8c1e3bc2742d8848569891fb42181"));
		hashMap.put(2, new Payment(2L, "bba8c1e3bc2742d8848569891ac32182"));
		hashMap.put(3, new Payment(3L, "6ua8c1e3bc2742d8848569891xt92183"));
	}

	@GetMapping("/pay/{id}")
	public Result<Payment> pay(@PathVariable("id") Integer id) {
		Payment payment = hashMap.get(id);
		return new Result<>(200, "port：" + serverPort, payment);
	}
}

