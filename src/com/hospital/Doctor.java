package com.hospital;

public class Doctor implements Reception {
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public void admitPatient(Patient p) {
		// TODO Auto-generated method stub
		setPatient(p);
	}

	@Override
	public void discharged() {
		// TODO Auto-generated method stub
		patient.setDischarge(true);
	}

}
