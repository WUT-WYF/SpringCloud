package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-03-22 18:02
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain84 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain84.class, args);
	}
}
