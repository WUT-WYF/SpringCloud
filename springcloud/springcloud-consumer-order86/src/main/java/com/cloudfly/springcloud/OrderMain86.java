package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author CloudFly
 * @create 2020-03-26 20:50
 */
@SpringBootApplication
@EnableFeignClients
public class OrderMain86 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain86.class, args);
	}
}
