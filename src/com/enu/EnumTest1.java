package com.enu;

enum MFund {
	Flex(50000, 500000);

	int min, max;

	private MFund(int min, int max) {
		this.max = max;
		this.min = min;
	}
}

enum Deposits {
	FD(10000, 100000), SB(5000, 200000), CD(10000, 200000);

	private int min, max;

	private Deposits(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}

public class EnumTest1 {
	public static void main(String[] args) {
		Deposits deposits = Deposits.FD;
		System.out.println("Maximum Amount:" + deposits.getMax() + " Minimum Amount: " + deposits.getMin());
	}
}
