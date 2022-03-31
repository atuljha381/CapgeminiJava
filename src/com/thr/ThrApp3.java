package com.thr;

public class ThrApp3 extends Thread {

	public ThrApp3(String name) {
		System.out.println("Is thread Activated " + (isAlive() ? "YES" : "NO"));
		start();
		setName(name);
		System.out.println("Is thread Activated " + (isAlive() ? "YES" : "NO"));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <= 15; i++) {
				System.out.println(getName() + " >> " + i);
				sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThrApp3("MyMember");
	}

}
