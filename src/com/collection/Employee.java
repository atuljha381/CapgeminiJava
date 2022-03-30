package com.collection;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name, job;
	private double sal;

	public Employee(int id, String name, String job, double sal) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if (this.getId() == o.getId())
			return 0;
		else if (this.getId() > o.getId())
			return 1;
		return -1;
	}

}