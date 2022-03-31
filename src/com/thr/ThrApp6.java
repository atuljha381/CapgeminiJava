package com.thr;

public class ThrApp6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Interface is loaded with runnable");
	}

	public static void main(String[] args) {
		// current class has the implementation of runnable interface
		ThrApp6 thrApp6 = new ThrApp6();
		// this will not execute directly because runnable interface has no start method
		// we need to register runnable interface with thread class
		Thread thr = new Thread(thrApp6);
		// now we will start thread
		thr.start();
	}

}
