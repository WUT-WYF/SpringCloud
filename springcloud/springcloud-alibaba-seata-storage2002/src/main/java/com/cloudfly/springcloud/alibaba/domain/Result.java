package com.cloudfly.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CloudFly
 * @create 2020-06-16 19:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
	private Integer code;
	private String message;
	private T data;

	public Result(Integer code, String message) {
		this(code,message,null);
	}
}
