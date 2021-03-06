package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaHandler2 {

	public static void showRecords(Predicate<Employee> prd, Consumer<Employee> con, ArrayList<Employee> emps) {
		emps.stream().filter(prd).forEach(con);
	}

	public static Stream<Employee> recs(List<Predicate<Employee>> prds, ArrayList<Employee> emps) {
		Stream<Employee> strm = emps.stream();
		for (Predicate<Employee> pr : prds) {
			strm.filter(pr);
		}
		return strm;
	}

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(101, "Sanjay", "Manager", 45000));
		emps.add(new Employee(102, "Vaibhav", "Executive", 35000));
		emps.add(new Employee(103, "Deepa", "Analyst", 40000));
		emps.add(new Employee(104, "Ashwin", "Clerk", 13000));
		emps.add(new Employee(105, "Irfan", "Clerk", 12000));

		Predicate<Employee> cond1 = e -> e.getJob().equalsIgnoreCase("clerk");
		Predicate<Employee> cond2 = e -> e.getSal() >= 30000;
		Predicate<Employee> cond3 = e -> e.getId() >= 100 && e.getId() <= 104;

		Consumer<Employee> output1 = Employee::showEmp;
		Consumer<Employee> output2 = e -> System.out.println(e.getId() + " " + e.getName());

//		emps.stream().filter(cond3).forEach(Employee::showEmp);
//		showRecords(cond2, output2, emps);
		System.out.println("-----------------------------------------------------------------------");
//		emps.stream().filter(cond3).filter(cond1).forEach(output2);

		List<Predicate<Employee>> lst = Arrays.asList(cond1, cond2);
		recs(lst, emps).forEach(output1);
	}
}
