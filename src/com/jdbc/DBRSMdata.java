package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DBRSMdata {
	public static void main(String[] args) throws Exception {
		DBConnector connector = DBConnector.getDBResource();
		Connection conn = connector.getConnected();
		Statement stmt = conn.createStatement();
		String queryString = "select * from person";
		ResultSet result = stmt.executeQuery(queryString);
		ResultSetMetaData rsmd = result.getMetaData();
		int cols = rsmd.getColumnCount();
		for (int i = 1; i <= cols; i++) {
			System.out.println(rsmd.getColumnName(i) + ">>" + rsmd.getColumnTypeName(i) + ">>" + rsmd.getPrecision(i));
		}
	}
}
