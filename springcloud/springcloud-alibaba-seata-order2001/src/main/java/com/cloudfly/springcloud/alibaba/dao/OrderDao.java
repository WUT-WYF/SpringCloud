package com.cloudfly.springcloud.alibaba.dao;

import com.cloudfly.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author CloudFly
 * @create 2020-06-14 22:21
 */
@Mapper
public interface OrderDao {
	/**
	 * 创建订单
	 * @param order
	 */
	void create(Order order);

	/**
	 * 更新订单状态
	 * @param userId
	 * @param status
	 */
	void update(@Param("userId") Long userId,@Param("status") Integer status);
}
