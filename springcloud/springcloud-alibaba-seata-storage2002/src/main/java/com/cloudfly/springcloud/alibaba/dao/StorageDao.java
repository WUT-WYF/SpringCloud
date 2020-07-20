package com.cloudfly.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author CloudFly
 * @create 2020-06-16 19:38
 */
@Mapper
public interface StorageDao {

	/**
	 * 扣减库存信息
	 * @param productId
	 * @param count
	 */
	void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
