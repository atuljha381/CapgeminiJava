package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropHandler {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileReader("C:\\Users\\ATUJHA\\eclipse-workspace\\FirstProject\\src\\mydata.properties"));
		Set keys = properties.keySet();
		
		for(Object key:keys) {
			System.out.println(key+" "+properties.getProperty(key.toString()));
		}
	}
}
