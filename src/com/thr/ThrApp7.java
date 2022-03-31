package com.thr;

public class ThrApp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			String[] nameStrings = { "Ajay", "Vijay", "Jamil", "John" };
			try {
				for (int i = 0; i < nameStrings.length; ++i) {
					System.out.println(nameStrings[i]);
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		};
		new Thread(runnable).start();
	}

}
