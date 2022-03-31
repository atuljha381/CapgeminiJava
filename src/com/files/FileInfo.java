package com.files;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ATUJHA\\OneDrive - Capgemini\\Desktop\\Newfolder\\test.txt");
		System.out.println("Name of the file: "+file.getName());
		System.out.println("Path of the file: "+file.getPath());
		System.out.println("Is File readable: "+file.canRead());
		System.out.println("Is File writable: "+file.canWrite());
		System.out.println("Does File exist? "+file.exists());
		System.out.println("Is it a file: "+file.isFile());
		System.out.println("Is it a folder: "+file.isDirectory());
	}

}
