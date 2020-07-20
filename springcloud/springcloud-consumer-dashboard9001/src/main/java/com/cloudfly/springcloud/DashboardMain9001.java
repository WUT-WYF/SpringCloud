package com.cloudfly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author CloudFly
 * @create 2020-04-12 12:22
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardMain9001 {
	public static void main(String[] args) {
		SpringApplication.run(DashboardMain9001.class, args);
	}
}
