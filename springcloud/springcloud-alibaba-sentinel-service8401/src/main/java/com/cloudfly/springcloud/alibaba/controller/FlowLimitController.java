package com.cloudfly.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloudfly.springcloud.alibaba.handler.CustomerBlockHandler;
import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-05-29 9:42
 */
@RestController
public class FlowLimitController {
	@GetMapping("/byResource")
	@SentinelResource(value = "byResource", blockHandler = "handleException")
	public Result byResource() {
		return new Result(200, "按资源名称限流测试OK", new Payment(2020L, "serial001"));
	}

	public Result handleException(BlockException exception) {
		return new Result(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
	}

	@GetMapping("/byUrl")
	@SentinelResource(value = "byUrl")
	public Result byUrl() {
		return new Result(200, "按url限流测试OK", new Payment(2020L, "serial002"));
	}

	@GetMapping("/customerBlockHandler")
	@SentinelResource(value = "customerBlockHandler",
			blockHandlerClass = CustomerBlockHandler.class,
			blockHandler = "hadnlerException2")
	public Result customerBlockHandler() {
		return new Result(200, "自定义限流", new Payment(2020L, "serial003"));
	}
}
