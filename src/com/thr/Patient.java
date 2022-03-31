package com.thr;

public class Patient extends Thread {
	private Doctor doctor;
	private String patientName;

	public Patient(Doctor doctor, String patientName) {
		this.doctor = doctor;
		this.patientName = patientName;
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			doctor.counsell(patientName);
			System.out.println("Process completed for: " + patientName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
