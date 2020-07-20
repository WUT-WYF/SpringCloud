package com.cloudfly.springcloud.alibaba.controller;

import com.cloudfly.springcloud.alibaba.domain.Result;
import com.cloudfly.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author CloudFly
 * @create 2020-06-16 20:16
 */
@RestController
public class AccountController {

	@Resource
	AccountService accountService;

	/**
	 * 扣减账户余额
	 * @param userId
	 * @param money
	 * @return
	 */
	@RequestMapping("/account/decrease")
	public Result decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
		accountService.decrease(userId, money);
		return new Result(200, "扣减账户余额成功！");
	}
}

