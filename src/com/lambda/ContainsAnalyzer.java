package com.lambda;

public class ContainsAnalyzer {
	public static void main(String[] args) {
		StringAnalyzer sa = (t, s) -> t.contains(s);
		System.out.println(sa.analyze("Atul", "t"));
	}

}
