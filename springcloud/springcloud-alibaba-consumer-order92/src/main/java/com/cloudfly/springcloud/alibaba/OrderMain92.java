package com.cloudfly.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author CloudFly
 * @create 2020-06-07 12:19
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain92 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain92.class, args);
	}
}
