package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBQuery2 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		String queryString = "select * from person";
		ResultSet result = stmt.executeQuery(queryString);
		result.first();
		System.out.println(result.getInt(1) + " " + result.getString(2));

		result.next();
		System.out.println(result.getInt(1) + " " + result.getString(2));

		result.last();
		System.out.println(result.getInt(1) + " " + result.getString(2));

		result.previous();
		System.out.println(result.getInt(1) + " " + result.getString(2));

		result.relative(-2);
		System.out.println(result.getInt(1) + " " + result.getString(2));

		result.absolute(3);
		System.out.println(result.getInt(1) + " " + result.getString(2));

		result.relative(2);
		System.out.println(result.getInt(1) + " " + result.getString(2));
	}

}
