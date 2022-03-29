package com.collection;

public class Person implements Comparable<Person> {
	private int id;
	private String name;

	public Person() {
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return getId() + " " + getName();
	}

	@Override
	public int compareTo(Person p) {
		if (this.getId() == p.getId())
			return 0;
		else if (this.getId() > p.getId())
			return 1;
		else
			return -1;

	}

}
