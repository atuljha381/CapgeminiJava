package com.collection;

import java.util.ArrayList;
import java.util.TreeMap;

public class MapTest2 {
	public static void main(String[] args) {
		TreeMap<Integer, Person> person = new TreeMap<Integer, Person>();
		person.put(001, new Person(101, "Haritha"));
		person.put(002, new Person(102, "Haritha"));
		person.put(003, new Person(103, "Haritha"));
		person.put(004, new Person(104, "Haritha"));
		person.put(005, new Person(105, "Haritha"));

		java.util.Set<Integer> key = person.keySet();

		for (int ind : key) {
			System.out.println("ID: " + ind + ", Value: " + person.get(ind));
		}

		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList.addAll(person.values());
		System.out.println(arrayList);
	}
}
