package com.cloudfly.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author CloudFly
 * @create 2020-03-14 17:57
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
