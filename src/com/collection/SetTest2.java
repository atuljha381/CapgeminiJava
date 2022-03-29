package com.collection;

import java.util.TreeSet;

public class SetTest2 {

	public static void main(String[] args) {
//		LinkedHashSet<Person> lhs = new LinkedHashSet<>();
		TreeSet<Person> lhs = new TreeSet<Person>();
		lhs.add(new Person(3, "Shyam"));
		lhs.add(new Person(2, "Raju"));
		lhs.add(new Person(1, "Baburao"));

		System.out.println(lhs);
	}

}
