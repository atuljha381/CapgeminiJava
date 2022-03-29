package com.lambda;

public class UseCalculator {

	public static void main(String[] args) {
		ICalculator cal = (a, b) -> {
			return (a + b);
		};

		System.out.println(cal.calculate(10, 20));
	}

}
