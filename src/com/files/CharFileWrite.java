package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				FileWriter writer = new FileWriter("C:\\Users\\ATUJHA\\OneDrive - Capgemini\\Desktop\\Newfolder\\test.txt");
				BufferedWriter buffer = new BufferedWriter(writer);
				InputStreamReader inputStreamReader = new InputStreamReader(System.in);
				BufferedReader rBufferedReader = new BufferedReader(inputStreamReader);
			) {
			String message="";
				System.out.println("Enter text");
				while(!(message=rBufferedReader.readLine()).equals(".end")) {
					buffer.write(message);
					buffer.newLine();
				}
//			buffer.close();
//			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
