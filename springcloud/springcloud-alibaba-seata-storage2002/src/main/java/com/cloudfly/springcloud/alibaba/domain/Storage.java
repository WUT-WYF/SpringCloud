package com.cloudfly.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author CloudFly
 * @create 2020-06-16 19:36
 */
@Data
public class Storage {
	private Long id;

	private Long productId;

	/**
	 * 总库存
	 */
	private Integer total;

	/**
	 * 已用库存
	 */
	private Integer used;

	/**
	 * 剩余库存
	 */
	private Integer residue;
}
