package com.clover.springcloud.green.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.clover.springcloud.green.feign.config.FeignConfiguration;

@FeignClient(value = "eureka-client-user-service", configuration = FeignConfiguration.class)
public interface UserRemoteClient {
	@GetMapping("/user/hello")
	String hello();
}