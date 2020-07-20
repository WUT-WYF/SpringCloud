package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author CloudFly
 * @create 2020-03-15 0:56
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7002.class, args);
	}
}
