package com.thr;

public class ThrApp3 extends Thread {
	private int delayTime;

	public ThrApp3(String name, int delayTime) {
		System.out.println("Is thread Activated " + (isAlive() ? "YES" : "NO"));
		start();
		setName(name);
		System.out.println("Is thread Activated " + (isAlive() ? "YES" : "NO"));
		this.delayTime = delayTime;
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
		ThrApp3 thr1 = new ThrApp3("MyMember", 1000);
		ThrApp3 thr2 = new ThrApp3("Process2", 1500);
	}

}
