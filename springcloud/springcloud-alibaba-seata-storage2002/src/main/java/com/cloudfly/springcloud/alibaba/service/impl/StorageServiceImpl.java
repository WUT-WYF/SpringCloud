package com.cloudfly.springcloud.alibaba.service.impl;

import com.cloudfly.springcloud.alibaba.dao.StorageDao;
import com.cloudfly.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author CloudFly
 * @create 2020-06-16 19:42
 */
@Service
public class StorageServiceImpl implements StorageService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

	@Resource
	private StorageDao storageDao;

	/**
	 * 扣减库存
	 * @param productId
	 * @param count
	 */
	@Override
	public void decrease(Long productId, Integer count) {
		LOGGER.info("------->storage-service中扣减库存开始");
		storageDao.decrease(productId, count);
		LOGGER.info("------->storage-service中扣减库存结束");
	}
}

