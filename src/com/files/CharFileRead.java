package com.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class CharFileRead {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("C:\\Users\\ATUJHA\\OneDrive - Capgemini\\Desktop\\Newfolder\\test.txt");
			BufferedReader buffer = new BufferedReader(reader);
			String lineString="";
			while((lineString=buffer.readLine())!=null) {
				System.out.println(lineString);
			}
//			buffer.close();
//			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
