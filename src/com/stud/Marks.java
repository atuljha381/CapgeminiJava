package com.stud;

public class Marks extends Student {
	private double s1,s2;
	public Marks() {
		// TODO Auto-generated constructor stub
		this.s1 = 0.0;
		this.s2 = 0.0;
	}
	
	public Marks(int sno, String sname, double s1, double s2) {
		super(sno, sname);
		this.s1 = s1;
		this.s2 = s2;
	}

	public double getS1() {
		return s1;
	}
	public void setS1(double s1) {
		this.s1 = s1;
	}
	public double getS2() {
		return s2;
	}
	public void setS2(double s2) {
		this.s2 = s2;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.format("English:%.1f\nMaths: %.1f",this.getS1(),this.getS2());
	}
	
	
}
