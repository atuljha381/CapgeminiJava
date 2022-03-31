package com.unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test4 {

	public static String divNum(int numerator, int denominator) {
		int quotient = 0;
		if (quotient == (numerator / denominator)) {
			System.out.println("Quotient= " + quotient);
			return "ok";
		} else {
			return "no";
		}
	}

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("Exception test");
		assertEquals("no", divNum(10, 2));
	}
}
