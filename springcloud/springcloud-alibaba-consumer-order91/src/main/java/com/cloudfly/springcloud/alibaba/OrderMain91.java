package com.cloudfly.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-05-31 21:49
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain91 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain91.class, args);
	}
}
