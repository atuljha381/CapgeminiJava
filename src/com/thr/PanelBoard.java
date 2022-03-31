package com.thr;

public class PanelBoard {
	public synchronized void interview(String person) {
		try {
			String quest[] = { "q1", "q2", "q3", "q4" };
			System.out.println(person + " join interview cabin");
			for (String question : quest) {
				System.out.println(question);
				System.out.println(person + " answered");
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
