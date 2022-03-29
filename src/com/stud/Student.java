package com.stud;

public class Student {
	private int sno;
	private String sname;
	public Student() {
		// TODO Auto-generated constructor stub
		this.sno = 0;
		this.sname = "null";
	}
	
	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
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
	
	public void show() {
		System.out.format("Seq No:%d\nName: %s\n",this.getSno(),this.getSname());
	}
}
