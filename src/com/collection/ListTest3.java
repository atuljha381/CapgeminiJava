package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(data);
		ll.addLast(40);
		ll.addLast(50);
		ll.addFirst(5);
		System.out.println("Display the first value: ");
		System.out.println(ll.getFirst());

		System.out.println("Display Last value: ");
		System.out.println(ll.getLast());

		System.out.println("Removing middle element which is: ");
		System.out.println(ll.remove(Math.abs(ll.size() / 2)));

		System.out.println("Displaying all values:");
		for (int n : ll) {
			System.out.println(n);
		}

	}

}
