package com.lambda;

import java.util.ArrayList;
import java.util.function.Function;

public class LambdaHandler4 {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Sanjay", "Manager", 45000));
		emps.add(new Employee(102, "Vaibhav", "Executive", 35000));
		emps.add(new Employee(103, "Deepa", "Analyst", 40000));
		emps.add(new Employee(104, "Ashwin", "Clerk", 13000));
		emps.add(new Employee(105, "Irfan", "Clerk", 12000));
		Function<Employee, Double> fn = e -> e.getSal();
		System.out.println("Salary of first record" + fn.apply(emps.get(0)));

		Function<Employee, String> getName = e -> e.getName();
		System.out.println("First record name=" + getName.apply(emps.get(0)));
	}
}
