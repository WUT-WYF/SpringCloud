package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-03-22 14:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8006.class, args);
	}
}
