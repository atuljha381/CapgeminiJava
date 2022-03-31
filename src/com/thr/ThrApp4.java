package com.thr;

class Thr1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] nameString = { "Ajay", "Vijay", "Jamil", "John" };
//		setPriority(1);
		try {
			for (int i = 0; i < nameString.length; i++) {
				System.out.print(nameString[i] + " ");
				sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Thr2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] locations = { "India", "Russia", "Israel", "Japan" };
//		setPriority(10);
		try {
			for (int i = 0; i < locations.length; i++) {
				System.out.print(locations[i] + " ");
				sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class ThrApp4 {
	public static void main(String[] args) {
		new Thr1().start();
		new Thr2().start();
	}
}