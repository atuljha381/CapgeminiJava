package com.lambda;

import java.util.ArrayList;

public class LambdaHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Sanjay", "Manager", 45000));
		emps.add(new Employee(102, "Vaibhav", "Executive", 35000));
		emps.add(new Employee(103, "Deepa", "Analyst", 40000));
		emps.add(new Employee(104, "Ashwin", "Clerk", 13000));
		emps.add(new Employee(105, "Irfan", "Clerk", 12000));

//		emps.forEach(e -> System.out.println(e.getId() + " " + e.getName()));

//		emps.stream().filter(e -> e.getName().contains("n"))
//				.forEach(e -> System.out.println(e.getName() + " " + e.getJob()));

//		emps.stream().filter(e -> e.getId() >= 101 && e.getId() <= 103).forEach(Employee::showEmp);

//		emps.stream().filter(e -> e.getId() > 100).peek(Employee::showEmp).map(e -> e.getSal() * 12)
//				.forEach(e -> System.out.println("Annual Salary: " + e));
		emps.stream().peek(Employee::showEmp).map(e -> e.getName().toUpperCase()).forEach(e -> System.out.println(e));

//		System.out.println(
//				"number of clerks: " + emps.stream().filter(e -> e.getJob().equalsIgnoreCase("clerk")).count());

//		Employee emp = emps.stream().max((e1, e2) -> e1.getSal() > e2.getSal() ? 1 : -1).get();
//		System.out.println("Highest Salary Earner: " + emp.getName() + " " + emp.getSal());
//
//		emp = emps.stream().min((e1, e2) -> e1.getSal() > e2.getSal() ? 1 : -1).get();
//		System.out.println("Lowest Salary Earner: " + emp.getName() + " " + emp.getSal());

		double totalSal = emps.stream().map(e -> e.getSal()).reduce(0.0, Double::sum);
		System.out.println("Total Salary: " + totalSal);

	}
}
