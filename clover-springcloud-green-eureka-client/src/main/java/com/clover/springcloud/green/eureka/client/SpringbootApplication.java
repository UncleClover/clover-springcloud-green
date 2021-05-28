package com.clover.springcloud.green.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableFeignClients(basePackages = "com.clover.springcloud.green.feign")
@EnableDiscoveryClient
public class SpringbootApplication {
	public static void main(String[] args) {
		System.setProperty("server.port", "8089");
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
