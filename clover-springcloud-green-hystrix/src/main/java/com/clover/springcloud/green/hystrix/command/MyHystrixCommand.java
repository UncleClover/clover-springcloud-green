package com.clover.springcloud.green.hystrix.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolProperties;

public class MyHystrixCommand extends HystrixCommand<String> {
	private final String name;

	public MyHystrixCommand(String name) {
//		super(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("MyGroup"))
//				.andCommandPropertiesDefaults(HystrixCommandProperties.Setter().withExecutionIsolationStrategy(
//						HystrixCommandProperties.ExecutionIsolationStrategy.SEMAPHORE)));
		
		super(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("MyGroup"))
	            .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
	                    .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD))
	            .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(1)
	                    .withMaxQueueSize(10).withMaximumSize(10)));
		this.name = name;
	}

	@Override
	protected String run() throws Exception {
		Thread.sleep(500);
		return this.name + ":" + Thread.currentThread().getName();
	}

	@Override
	protected String getFallback() {
		return "调用失败";
	}
}