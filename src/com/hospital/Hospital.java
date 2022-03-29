package com.hospital;

public class Hospital extends Doctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		hospital.admitPatient(new Patient("Raj", 30, "Regular Checkup"));
		Patient patient = hospital.getPatient();
		System.out.format("Patient Name: %s\nPatient Age: %d\nIssue: %s\nAdmitted: %s\n", patient.getPname(),
				patient.getAge(), patient.getIssue(), !patient.isDischarge());

		hospital.discharged();
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.format("Patient Name: %s\nPatient Age: %d\nIssue: %s\nAdmitted: %s\n", patient.getPname(),
				patient.getAge(), patient.getIssue(), !patient.isDischarge());

	}

}
