package com.jdbc;

public class Person {
	private int id;
	private String name;
	private String job;

	public Person() {
	}

	public Person(int id, String name, String job) {
		this.id = id;
		this.name = name;
		this.job = job;
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

}
