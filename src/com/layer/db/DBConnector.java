package com.layer.db;

import java.io.FileReader;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnector {
	private static DBConnector connector = new DBConnector();

	private DBConnector() {
	}

	public static DBConnector getDBResource() {
		return connector;
	}

	public java.sql.Connection getConnected() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader("D:\\Eclipse-Workspace\\JavaApp1\\src\\com\\layer\\dbinfo.properties"));
		// return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe",
		// "hr", "hr");
		return DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("uid"),
				properties.getProperty("pwd"));
	}
}
