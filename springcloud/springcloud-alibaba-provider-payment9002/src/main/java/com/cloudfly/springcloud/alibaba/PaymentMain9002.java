package com.cloudfly.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-05-22 22:33
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9002.class, args);
	}
}
