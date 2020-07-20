package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author CloudFly
 * @create 2020-04-25 18:50
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterMain3344.class, args);
	}
}
