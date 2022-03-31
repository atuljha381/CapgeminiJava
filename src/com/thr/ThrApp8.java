package com.thr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThrApp8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = () -> {
			System.out.println("First Thread Loaded");
		};
		Runnable r2 = () -> {
			for (int i = 1; i < 5; ++i) {
				System.out.println("Hello==>" + i);
			}
		};
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(r1);
		service.execute(r2);
		service.shutdown();
	}

}
