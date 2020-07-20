package com.cloudfly.springcloud.service;

import com.cloudfly.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author CloudFly
 * @create 2020-03-14 18:06
 */
public interface PaymentService {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
