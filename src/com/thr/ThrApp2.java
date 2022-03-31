package com.thr;

public class ThrApp2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child thread is ready to execute");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started from main...");
		ThrApp2 thr = new ThrApp2();
//		thr.run(); // wrong approach

		thr.start();
	}

}
