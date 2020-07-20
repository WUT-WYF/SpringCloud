package com.cloudfly.springcloud.alibaba.service;

/**
 * @author CloudFly
 * @create 2020-06-16 19:41
 */
public interface StorageService {

	/**
	 * 扣减库存
	 */
	void decrease(Long productId, Integer count);
}
