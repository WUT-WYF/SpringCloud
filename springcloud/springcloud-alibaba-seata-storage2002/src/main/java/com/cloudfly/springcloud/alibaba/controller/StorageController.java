package com.cloudfly.springcloud.alibaba.controller;

import com.cloudfly.springcloud.alibaba.domain.Result;
import com.cloudfly.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CloudFly
 * @create 2020-06-16 19:44
 */
@RestController
public class StorageController {

	@Autowired
	private StorageService storageService;

	/**
	 * 扣减库存
	 *
	 * @param productId
	 * @param count
	 * @return
	 */
	@RequestMapping("/storage/decrease")
	public Result decrease(Long productId, Integer count) {
		storageService.decrease(productId, count);
		return new Result(200, "扣减库存成功！");
	}
}
