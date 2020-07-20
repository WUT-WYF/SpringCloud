package com.cloudfly.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author CloudFly
 * @create 2020-06-16 20:15
 */
public interface AccountService {
	/**
	 * 扣减账户余额
	 * @param userId
	 * @param money
	 */
	void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
