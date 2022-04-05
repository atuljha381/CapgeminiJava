package com.logger.ex2;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4Test2 {
	static Logger logger = Logger.getLogger(Log4Test2.class.getName());

	public static void main(String[] args) {
		PropertyConfigurator.configure("D:\\Eclipse-Workspace\\JavaApp1\\src\\com\\logger\\ex2\\log4.properties");
		// logger.addAppender(new ConsoleAppender(new PatternLayout("%r [%t] %p %c %x -
		// %m%n")));
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is a warn message");
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		System.out.println("Executed Successfully.....");

	}

}
