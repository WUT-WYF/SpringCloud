package com.cloudfly.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author CloudFly
 * @create 2020-06-16 20:13
 */
@Mapper
public interface AccountDao {
	/**
	 * 扣减账户余额
	 * @param userId
	 * @param money
	 */
	void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
