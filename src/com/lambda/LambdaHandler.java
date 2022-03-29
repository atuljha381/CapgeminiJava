package com.lambda;

import java.util.ArrayList;

public class LambdaHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Sanjay", "Manager", 45000));
		emps.add(new Employee(102, "Vaibhav", "Executive", 35000));
		emps.add(new Employee(103, "Deepa", "Analyst", 40000));
		emps.add(new Employee(104, "Ashwin", "Clerk", 12000));
		emps.add(new Employee(105, "Irfan", "Clerk", 12000));

//		emps.forEach(e -> System.out.println(e.getId() + " " + e.getName()));

		emps.stream().filter(e -> e.getName().contains("n"))
				.forEach(e -> System.out.println(e.getName() + " " + e.getJob()));
	}
}
