package com.hospital;

public class Patient {
	private String pname;
	private int age;
	private String issue;
	private boolean discharge;

	public Patient(String pname, int age, String issue) {
		this.pname = pname;
		this.age = age;
		this.issue = issue;
		this.discharge = false;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public boolean isDischarge() {
		return discharge;
	}

	public void setDischarge(boolean discharge) {
		this.discharge = discharge;
	}

}
