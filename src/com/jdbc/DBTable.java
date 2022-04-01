package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
		String command = "CREATE table Person(pid number primary key, pname varchar(20), pjob varchar(20))";
		Statement stmt = conn.createStatement();
		stmt.execute(command);
		System.out.println("Table Created");
	}

}
