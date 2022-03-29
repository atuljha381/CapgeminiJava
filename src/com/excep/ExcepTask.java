package com.excep;

public class ExcepTask {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int arr2[] = new int[5];

		try {
			arr2 = arr;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr2[i]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);

		}

//		try {
//
//			for (int i = 0; i < arr.length; i++) {
//				arr2[i] = arr[i];
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//
//		}

//		String data[] = { "one", "two", "three", "four", "ape", "apple", "book" };
//		try {
//			for (int i = 0; i < data.length; ++i) {
//				if (data[i].charAt(2) == 'e') {
//					throw new Exception("Exception occured");
//				}
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
	}
}
