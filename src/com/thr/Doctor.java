package com.thr;

public class Doctor {
	public synchronized void prescribe() {
		try {
			System.out.println("Giving prescription");
			Thread.sleep(1000);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public synchronized void counsell(String patientName) {
		try {
			System.out.println("Doctor gave counselling to patient " + patientName);
			Thread.sleep(2000);
			prescribe();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
