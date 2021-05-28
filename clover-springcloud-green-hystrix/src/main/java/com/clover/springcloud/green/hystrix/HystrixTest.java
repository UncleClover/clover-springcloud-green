package com.clover.springcloud.green.hystrix;

import java.util.concurrent.ExecutionException;

import com.clover.springcloud.green.hystrix.command.MyHystrixCommand;

public class HystrixTest {
	public static void main(String[] args) throws Exception {
//		String result = new MyHystrixCommand("clover").execute();
//		System.out.println(result);
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread() {
				@Override
				public void run() {
					try {
						System.out.println(new MyHystrixCommand("clover").queue().get());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			t.start();
		}
	}
}
