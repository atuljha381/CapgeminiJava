package com.bank;

public class Customer {
	private int acno;
	private String acname;
	private double depAmount;
	private boolean status;

	public Customer() {
	}

	public Customer(int acno, String acname, double depAmount) {
		super();
		this.acno = acno;
		this.acname = acname;
		this.depAmount = depAmount;
		this.status = true;
	}

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public double getDepAmount() {
		return depAmount;
	}

	public void setDepAmount(double depAmount) {
		this.depAmount = depAmount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
