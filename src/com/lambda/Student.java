package com.lambda;

public class Student {
	private int sno;
	private String sname;
	private int sub1, sub2;

	public Student() {

	}

	public Student(int sno, String sname, int sub1, int sub2) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public void show() {
		System.out.format("Seq No:%d\nName: %s\n", this.getSno(), this.getSname());
	}
}
