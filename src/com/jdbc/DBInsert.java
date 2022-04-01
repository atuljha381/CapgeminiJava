package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));) {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
			conn.setAutoCommit(false);
			System.out.println("Person Id: ");
			int id = Integer.parseInt(buffer.readLine());
			System.out.println("Person Name: ");
			String name = buffer.readLine();
			System.out.println("Person Job: ");
			String job = buffer.readLine();
			String command = "insert into person values(" + id + ",'" + name + "','" + job + "')";
			Statement stmt = conn.createStatement();
			stmt.execute(command);
			conn.commit();
			System.out.println("Record Inserted");
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
