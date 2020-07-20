package com.cloudfly.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-05-23 11:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain90 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain90.class, args);
	}
}
