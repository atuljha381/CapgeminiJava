package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTest {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
		System.out.println("Database Connected");
	}

}
