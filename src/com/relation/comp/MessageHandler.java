package com.relation.comp;

public class MessageHandler implements MessageService, Calculator {

	@Override
	public String invitation(String username) {
		return "Welcome " + username;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageHandler messageHandler = new MessageHandler();
		System.out.println(messageHandler.invitation("Sampath"));
		System.out.println("Interest Value: " + messageHandler.calInterest(10000, 3, 12));
		System.out.println("Sum: " + messageHandler.add(5, 10));
		System.out.println("Square: " + messageHandler.square(14));
		messageHandler.hi();
	}

	@Override
	public double calInterest(int p, double r, int t) {
		double interest = (p * t * r) / 100;
		return interest;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int square(int x) {
		// TODO Auto-generated method stub
		return x * x;
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
//		System.out.println("Tester Hi");

	}

}
