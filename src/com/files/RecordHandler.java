package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class RecordHandler {
	public static void main(String[] args) {
		try(
				FileWriter writer = new FileWriter("C:\\Users\\ATUJHA\\OneDrive - Capgemini\\Desktop\\Newfolder\\mydata.txt");
				BufferedWriter buffer = new BufferedWriter(writer);
				InputStreamReader inputStreamReader = new InputStreamReader(System.in);
				BufferedReader rBufferedReader = new BufferedReader(inputStreamReader);
			) {
			System.out.println("Enter Id: "); int id=Integer.parseInt(rBufferedReader.readLine());
			System.out.println("Enter Name: "); String nameString = rBufferedReader.readLine();
			String recordString = id+","+nameString;
			buffer.write(recordString);
			buffer.newLine();
			System.out.println("Record Stored");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
	