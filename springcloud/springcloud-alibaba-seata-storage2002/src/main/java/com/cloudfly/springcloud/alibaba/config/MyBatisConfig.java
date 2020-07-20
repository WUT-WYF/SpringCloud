package com.cloudfly.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author CloudFly
 * @create 2020-06-14 22:35
 */
@Configuration
@MapperScan({"com.cloudfly.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
