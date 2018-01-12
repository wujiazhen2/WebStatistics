package com.qworldr.webstatistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LogserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogserverApplication.class, args);
	}
}
