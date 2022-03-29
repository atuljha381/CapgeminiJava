package com.collection;

import java.util.Comparator;

public class ComparatorTest implements Comparator<Employee> {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Suman", "clerk", 15000);
		Employee e2 = new Employee(102, "Bhanu", "clerk", 15000);
		ComparatorTest cTest = new ComparatorTest();
		System.out.println(cTest.compare(e1, e2) == 0 ? "Same Name Entered"
				: cTest.compare(e1, e2) > 0 ? e1.getName() : e2.getName());
//		Employee e3 = new Employee(101, "Suman", "clerk", 15000);
//		Employee e4 = new Employee(101, "Suman", "clerk", 15000);

	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
