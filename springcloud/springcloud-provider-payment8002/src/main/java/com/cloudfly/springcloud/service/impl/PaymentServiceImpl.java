package com.cloudfly.springcloud.service.impl;

import com.cloudfly.springcloud.dao.PaymentDao;
import com.cloudfly.springcloud.pojo.Payment;
import com.cloudfly.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CloudFly
 * @create 2020-03-14 18:06
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
