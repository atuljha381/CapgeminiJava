package com.thr;

public class Interviewer extends Thread {
	private PanelBoard panel;
	private String person;

	public Interviewer(PanelBoard panel, String person) {
		this.panel = panel;
		this.person = person;
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			panel.interview(person);
			Thread.sleep(3000);
			System.out.println("Process completed for " + person);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
