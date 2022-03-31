package com.files;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\ATUJHA");
		if(file.isDirectory()) {
			String list[]=file.list();
			for(String name:list) {
				File f1= new File(name);
				System.out.println(f1.getName());
			}
		}
		else {
			System.out.println("It is not a folder");
		}
	}
}
