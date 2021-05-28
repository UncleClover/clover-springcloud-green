package com.clover.springcloud.green.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.clover.springcloud.green.eureka.client.utils.LogUtils;
import com.clover.springcloud.green.feign.model.interfaces.UserRemoteClient;

@RestController
public class HelloController {
	@Autowired
	private Environment env;

	@Autowired
	private LogUtils logUtils;

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UserRemoteClient client;

	@GetMapping("/hello")
	public String hello() {
		logUtils.saveLog();
		String port = env.getProperty("server.port");
		return "hello" + port;
	}

	@GetMapping("/article/callHello2")
	public String callHello2() {
		return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
	}
	
	@GetMapping("/feign/hello")
	public String feignHello() {
		return client.hello();
	}
}