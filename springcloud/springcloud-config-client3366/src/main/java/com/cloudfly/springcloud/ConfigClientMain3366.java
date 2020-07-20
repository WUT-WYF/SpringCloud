package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author CloudFly
 * @create 2020-05-18 14:24
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientMain3366.class, args);
	}
}
