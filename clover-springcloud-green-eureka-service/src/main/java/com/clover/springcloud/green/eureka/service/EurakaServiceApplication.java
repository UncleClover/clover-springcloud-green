package com.clover.springcloud.green.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurakaServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurakaServiceApplication.class, args);
	}
}