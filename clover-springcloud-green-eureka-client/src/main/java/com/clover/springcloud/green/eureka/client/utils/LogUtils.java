package com.clover.springcloud.green.eureka.client.utils;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class LogUtils {
	@Async
	public void saveLog() {
		try {
			Thread.sleep(5000);
			System.err.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
