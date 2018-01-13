package com.qworldr.webstatistics;

import com.netflix.zuul.ZuulFilter;
import com.qworldr.webstatistics.filter.PermisFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public ZuulFilter PermisFilter(){
		return new PermisFilter();
	}
}
