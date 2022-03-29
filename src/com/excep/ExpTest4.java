package com.excep;

public class ExpTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr1[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
			int arr2[] = new int[5];
			for (int i = 0; i < 8; i++) {
				arr2[i] = arr1[i];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Too many values to insert");
			// e.printStackTrace();
		}

	}

}