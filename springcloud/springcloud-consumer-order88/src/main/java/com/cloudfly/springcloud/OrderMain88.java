package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author CloudFly
 * @create 2020-03-30 21:19
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderMain88 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain88.class, args);
	}
}
