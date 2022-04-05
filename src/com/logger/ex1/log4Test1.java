package com.logger.ex1;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class log4Test1 {
	private static final Logger log = Logger.getLogger(log4Test1.class);

	public static void main(String[] args) {
		// This is the root logger provided by log4j
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.DEBUG);

		// Define log pattern layout
		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t]  %c %x - %m%n");

		// Add console appender to root logger
		rootLogger.addAppender(new ConsoleAppender(layout));
		try {
			int a = 10;
			int b = 0;
			RollingFileAppender fileAppender = new RollingFileAppender(layout, "demotestlog.log");
			if (a == 0 || b == 0) {
				log.warn("Denominator found to be zero");
			}
			rootLogger.addAppender(fileAppender);
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			log.error("Denominator cannot be zero");
		} finally {
			log.info("Application Loaded");
		}
	}
}
