package com.clover.springcloud.green.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clover.springbootstarterdemo.client.UserClient;

@RestController
public class UserController {
	
	@Autowired
	private UserClient userClient;

	@GetMapping("/user/name")
	public String getUserName() {
		return userClient.getUserName();
	}
}