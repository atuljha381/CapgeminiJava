package com.collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeDAO {
	private static TreeMap<Integer, Employee> employees = new TreeMap<Integer, Employee>();

	public void addEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Id: ");
		int empid = sc.nextInt();
		System.out.println("Employee Name: ");
		String ename = sc.next();
		System.out.println("Employee Job: ");
		String ejob = sc.next();
		System.out.println("Employee Salary: ");
		double esal = sc.nextDouble();
		employees.put(empid, new Employee(empid, ename, ejob, esal));
		System.out.println("Record Added");

	}

	public void viewAll() {
		ArrayList<Employee> list = new ArrayList<>(employees.values());
		for (Employee emp : list) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getJob() + " " + emp.getSal());
		}
	}

	public void getEmpById(int id) {
		Employee emp = employees.get(id);
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getJob() + " " + emp.getSal());
	}

	public void getUpdBySal(int id, double sal) {
		Employee emp = employees.get(id);
		emp.setSal(sal);
		employees.put(id, emp);
		System.out.println("Record after update");
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getJob() + " " + emp.getSal());
	}

	public void deleteEmpById(int id) {
		employees.remove(id);
		System.out.println("record deleted");
	}

}
