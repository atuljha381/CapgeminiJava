package com.thr;

public class ThrApp5 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i <= 15; ++i) {
				if (i % 2 == 0 && i >= 12) {
					interrupt();
				} else {
					System.out.println(" >> " + i);
				}
				sleep(1000);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ThrApp5().start();
	}
}
