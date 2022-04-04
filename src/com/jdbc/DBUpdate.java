package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUpdate {

	public static void main(String[] args) {

		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			conn.setAutoCommit(false);
			System.out.println("Person ID:");
			int id = Integer.parseInt(buffer.readLine());
			System.out.println("Person's New JOB:");
			String job = buffer.readLine();
			String command = "update person set pjob='" + job + "' where pid=" + id;

			java.sql.Statement stmt = conn.createStatement();
			stmt.executeUpdate(command);
			conn.commit();
			System.out.println("Record Updated");
			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}