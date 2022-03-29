package com.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaHandler3 {

	public static Stream<Employee> getStream(ArrayList<Employee> emps) {
		return emps.stream();
	}

	public static Stream<Employee> getStream(Predicate<Employee> cond, Consumer<Employee> output,
			ArrayList<Employee> emps) {
		return emps.stream().filter(cond);
	}

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Sanjay", "Manager", 45000));
		emps.add(new Employee(102, "Vaibhav", "Executive", 35000));
		emps.add(new Employee(103, "Deepa", "Analyst", 40000));
		emps.add(new Employee(104, "Ashwin", "Clerk", 13000));
		emps.add(new Employee(105, "Irfan", "Clerk", 12000));
		Stream<Employee> strm = getStream(emps);

		Predicate<Employee> cond1 = e -> e.getJob().equalsIgnoreCase("clerk");
		Predicate<Employee> cond2 = e -> e.getSal() >= 30000;
		Predicate<Employee> cond3 = e -> e.getId() >= 100 && e.getId() <= 104;

		Consumer<Employee> output1 = Employee::showEmp;
		Consumer<Employee> output2 = e -> System.out.println(e.getId() + " " + e.getName());

		Stream<Employee> strm1 = getStream(cond1, output1, emps);

//		strm.filter(cond1).peek(output1).map(e -> e.getSal() * 12).forEach(e -> System.out.println(e));
		strm1.forEach(output2);
	}

}
