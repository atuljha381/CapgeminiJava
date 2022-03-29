package com.collection;

import java.util.Scanner;

public class PersonArrayTest {
	public static void main(String[] args) {
		Person persons[] = new Person[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id and Name of person");
		int id;
		String name;
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Record " + (i + 1));
			id = sc.nextInt();
			name = sc.next();
			persons[i] = new Person(id, name);
		}

		for (Person p : persons) {
			System.out.println(p.toString());
		}
	}
}
