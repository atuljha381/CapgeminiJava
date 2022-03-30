package com.files;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class BinFileWriteTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("C:\\Users\\ATUJHA\\OneDrive - Capgemini\\Desktop\\Newfolder\\test.txt",true);
		DataInputStream inputStream = new DataInputStream(System.in);
		
		System.out.println("Enter your text");
		String message="";
		while(!(message=inputStream.readLine()).equals(".end")) {
			fout.write(message.getBytes());
		}
//		String message=inputStream.readLine();
//		
//		fout.write(message.getBytes());
		System.out.println("Content written in file");
		inputStream.close();
		fout.close();

	}

}
