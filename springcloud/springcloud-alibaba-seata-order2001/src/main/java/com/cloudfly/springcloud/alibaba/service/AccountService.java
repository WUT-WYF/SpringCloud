package com.cloudfly.springcloud.alibaba.service;

import com.cloudfly.springcloud.alibaba.domain.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author CloudFly
 * @create 2020-06-14 22:29
 */
@FeignClient(value = "springcloud-alibaba-seata-account-service")
public interface AccountService {
	@GetMapping(value = "/account/decrease")
	Result decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
