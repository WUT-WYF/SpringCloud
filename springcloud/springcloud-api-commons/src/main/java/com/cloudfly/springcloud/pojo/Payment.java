package com.cloudfly.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author CloudFly
 * @create 2020-03-14 17:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
	private Long id;
	private String serial;
}