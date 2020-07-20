package com.cloudfly.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author CloudFly
 * @create 2020-04-12 23:30
 */
@Configuration
public class GateWayConfig {
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
		RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
		routes.route("path_route",r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
		routes.route("path_route",r->r.path("/mil").uri("http://news.baidu.com/mil")).build();
		return routes.build();
	}
}
