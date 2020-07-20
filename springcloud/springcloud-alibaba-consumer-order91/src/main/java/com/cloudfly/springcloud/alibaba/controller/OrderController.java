package com.cloudfly.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.pojo.Result;
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
//	@SentinelResource(value = "fallback") //没有配置
//	@SentinelResource(value = "fallback",fallback = "handlerFallback") //fallback只负责业务异常
//	@SentinelResource(value = "fallback",blockHandler = "blockHandler") //blockHandler只负责sentinel控制台配置违规
	@SentinelResource(value = "fallback", fallback = "handlerFallback", blockHandler = "blockHandler", exceptionsToIgnore = {IllegalArgumentException.class})
	public Result<Payment> order(@PathVariable("id") Long id) {
		Result<Payment> result = restTemplate.getForObject(serverURL + "/pay/" + id, Result.class);

		if (id == 4L) {
			throw new IllegalArgumentException("IllegalArgumentException,非法参数异常....");
		} else if (result.getData() == null) {
			throw new NullPointerException("NullPointerException,该ID没有对应记录,空指针异常");
		}

		return result;
	}

	//fallback
	public Result handlerFallback(@PathVariable Long id, Throwable e) {
		Payment payment = new Payment(id, "null");
		return new Result<>(444, "兜底异常handlerFallback,exception内容  " + e.getMessage(), payment);
	}

	//blockHandler
	public Result blockHandler(@PathVariable Long id, BlockException blockException) {
		Payment payment = new Payment(id, "null");
		return new Result<>(445, "blockHandler-sentinel限流,无此流水: blockException  " + blockException.getMessage(), payment);
	}
}
