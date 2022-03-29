package com.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Numerator");
			int n = sc.nextInt();
			System.out.println("Enter Denominator");
			int m = sc.nextInt();
			System.out.println("Quotient Value=" + (n / m));
			System.out.println("Calculation Compiled Successfully");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Denominator Cannot be zero");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("Integer Excepted");
		} finally {
			System.out.println("End of program");
		}
	}

}
