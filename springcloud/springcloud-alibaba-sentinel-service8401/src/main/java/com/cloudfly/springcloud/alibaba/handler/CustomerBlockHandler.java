package com.cloudfly.springcloud.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloudfly.springcloud.pojo.Result;

/**
 * @author CloudFly
 * @create 2020-05-29 15:06
 */
public class CustomerBlockHandler {
	public static Result hadnlerException1(BlockException exception) {
		return new Result(444, "自定义全局限流异常---1");
	}

	public static Result hadnlerException2(BlockException exception) {
		return new Result(444, "自定义全局限流异常---2");
	}
}
