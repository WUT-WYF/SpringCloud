package com.cloudfly.springcloud.alibaba.service;

import com.cloudfly.springcloud.alibaba.domain.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author CloudFly
 * @create 2020-06-14 22:29
 */
@FeignClient(value = "springcloud-alibaba-seata-storage-service")
public interface StorageService {
	@GetMapping(value = "/storage/decrease")
	Result decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
