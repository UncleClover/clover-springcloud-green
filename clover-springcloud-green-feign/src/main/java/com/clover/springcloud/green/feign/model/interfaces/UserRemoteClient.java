package com.clover.springcloud.green.feign.model.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-user-service")
public interface UserRemoteClient {
	@GetMapping("/user/hello")
	String hello();
}