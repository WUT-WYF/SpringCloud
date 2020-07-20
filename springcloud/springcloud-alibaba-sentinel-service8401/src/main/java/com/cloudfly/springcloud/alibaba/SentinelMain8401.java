package com.cloudfly.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CloudFly
 * @create 2020-05-27 14:24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelMain8401 {
	public static void main(String[] args) {
		SpringApplication.run(SentinelMain8401.class, args);
	}
}
