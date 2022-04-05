package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class DBInsert {
	private static final Logger log = Logger.getLogger(DBInsert.class);

	public static void main(String[] args) {
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.DEBUG);

		// Define log pattern layout
		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] - %m%n");
		rootLogger.addAppender(new ConsoleAppender(layout));

		try (BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));) {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "hr");
			conn.setAutoCommit(false);
			System.out.println("Person Id: ");
			int id = Integer.parseInt(buffer.readLine());
			log.info("Id input taken");
			System.out.println("Person Name: ");
			String name = buffer.readLine();
			log.info("Name input taken");
			System.out.println("Person Job: ");
			String job = buffer.readLine();
			log.info("Job input taken");
			String command = "insert into person values(" + id + ",'" + name + "','" + job + "')";
			Statement stmt = conn.createStatement();
			stmt.execute(command);
			log.info("Successfully Inserted All data");
			conn.commit();

			stmt.close();
			conn.close();

		} catch (Exception e) {
			log.error("Could not insert data");
		}

	}

}
