package com.cloudfly.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CloudFly
 * @create 2020-03-23 16:17
 */
@Configuration
public class Rule {
	@Bean
	public IRule myRule(){
		// 随机
		return new RandomRule();
	}
}
