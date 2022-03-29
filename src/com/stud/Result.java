package com.stud;

public class Result extends Marks {

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(int sno, String sname, double s1, double s2) {
		super(sno, sname, s1, s2);
		// TODO Auto-generated constructor stub
	}
	
	public double total() {
		double total=0.0;
		total =  (int)(super.getS1() + super.getS2());
		return total;
	}
	public double average() {
		double average;
		average = total()/2;
		return average;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.format("\nTotal Marks: %.1f\nAverage: %.1f",total(),average());
	}

}
