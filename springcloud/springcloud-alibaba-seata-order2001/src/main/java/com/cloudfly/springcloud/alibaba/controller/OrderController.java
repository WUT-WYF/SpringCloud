package com.cloudfly.springcloud.alibaba.controller;

import com.cloudfly.springcloud.alibaba.domain.Order;
import com.cloudfly.springcloud.alibaba.domain.Result;
import com.cloudfly.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author CloudFly
 * @create 2020-06-14 22:34
 */
@RestController
public class OrderController {
	@Resource
	private OrderService orderService;

	@GetMapping("/order/create")
	public Result create(Order order) {
		orderService.create(order);
		return new Result(200, "订单创建成功");
	}
}
