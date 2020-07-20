package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author CloudFly
 * @create 2020-04-12 20:37
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
	public static void main(String[] args) {
		SpringApplication.run(GateWayMain9527.class, args);
	}
}
