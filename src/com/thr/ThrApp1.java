package com.thr;

public class ThrApp1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println("Priority: " + Thread.currentThread().getPriority());
	}
}
