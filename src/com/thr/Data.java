package com.thr;

public class Data {
	private String packet;
	// True if receiver should wait
	// False if sender should wait
	private boolean transfer = true;

	public synchronized String receive() {
		while (transfer) {
			try {
				System.out.println("waiting to Tranfer data");
				wait();

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread Interrupted");
			}
		}
		transfer = true;

		String returnPacket = packet;
		System.out.println("Data received");
		notifyAll();
		return returnPacket;
	}

	public synchronized void send(String packet) {
		while (!transfer) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread Interrupted");
			}
		}
		transfer = false;

		this.packet = packet;
		notifyAll();
		System.out.println("Data Sent to Receiver");
	}

}