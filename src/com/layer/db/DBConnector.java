package com.layer.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	private static DBConnector connector = new DBConnector();

	private DBConnector() {
	}

	public static DBConnector getDBResource() {
		return connector;
	}

	public Connection getConnected() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");

	}
}
