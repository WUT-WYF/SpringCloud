package com.cloudfly.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author CloudFly
 * @create 2020-05-23 14:47
 */
@Configuration
public class ApplicationContextConfig {
	@Bean
	// 使用 @LoadBalanced注解 赋予 RestTemplate 负载均衡 能力
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
