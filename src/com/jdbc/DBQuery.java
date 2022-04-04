package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBQuery {
	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
		Statement stmt = conn.createStatement();
		String queryString = "select * from person";
		ResultSet result = stmt.executeQuery(queryString);
		while (result.next()) {
			System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString("pjob"));
		}
		result.close();
		stmt.close();
		conn.close();
	}
}
