package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class DBCall_Procedure {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
		CallableStatement cstmt = conn.prepareCall("{ CALL person_add(?,?,?)}");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Person Id: ");
		int id = scanner.nextInt();
		System.out.println("Person Name: ");
		String name = scanner.next();
		System.out.println("Person Job: ");
		String job = scanner.next();

		cstmt.setInt(1, id);
		cstmt.setString(2, name);
		cstmt.setString(3, job);
		cstmt.execute();
		System.out.println("Executed Successfully");

	}

}
