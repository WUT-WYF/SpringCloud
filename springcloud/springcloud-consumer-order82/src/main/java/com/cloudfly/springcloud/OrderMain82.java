package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-03-21 12:21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain82 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain82.class, args);
	}
}
