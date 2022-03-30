package com.files;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class BinFileReadTest {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("C:\\Users\\ATUJHA\\OneDrive - Capgemini\\Desktop\\Newfolder\\test.txt");
		BufferedInputStream ibuffer = new BufferedInputStream(fin);
		DataInputStream inputStream = new DataInputStream(ibuffer);
		String lineString="";
//		int ch;
//		while((ch=ibuffer.read())!=-1) {
//			System.out.print((char)ch);
//		}
//		
		while((lineString=inputStream.readLine())!=null) {
			System.out.print(lineString);
		}
		
		System.out.println();
		ibuffer.close();
		fin.close();
	}
}
