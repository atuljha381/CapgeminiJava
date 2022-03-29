package com.collection;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO dao = new EmployeeDAO();

		System.out.println("1.Add Details\n2.View All \n3.View By Id\n4.Update Record\n5.Delete\n6.Exit");

		Scanner sc = new Scanner(System.in);
		int op = 0;
		while (true) {
			System.out.println("Enter your choice");
			op = sc.nextInt();
			switch (op) {
			case 1: {
				dao.addEmployee();

			}
			case 2: {
				dao.viewAll();
				break;

			}
			case 3: {
				System.out.println("Enter employee id to get detail of");
				int id = sc.nextInt();
				dao.getEmpById(id);
				break;
			}
			case 4: {
				System.out.println("Enter employee id to get detail of");
				int id = sc.nextInt();
				System.out.println("New Salary");
				double sal = sc.nextDouble();
				dao.getUpdBySal(id, sal);
				break;

			}
			case 5: {
				System.out.println("Enter employee id to delete");
				dao.deleteEmpById(sc.nextInt());
				break;
			}

			default:
				System.out.println("Invalid Input");

			}

		}
	}

}
