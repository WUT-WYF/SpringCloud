package com.cloudfly.springcloud;

import com.cloudfly.rule.Rule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author CloudFly
 * @create 2020-03-14 19:39
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "SPRINGCLOUD-PAYMENT-SERVICE",configuration = Rule.class)
public class OrderMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderMain80.class, args);
	}
}

