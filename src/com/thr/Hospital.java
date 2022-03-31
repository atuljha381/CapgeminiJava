package com.thr;

public class Hospital {
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		Patient patient = new Patient(doctor, "Naresh");
		Patient patient2 = new Patient(doctor, "Kamlesh");
	}
}
