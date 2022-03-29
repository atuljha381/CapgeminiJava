package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTest2 {
	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(10);
		data.add(20);
		data.add(30);
		data.add(11);
		data.add(12);
		data.add(13);
		data.add(14);
		Iterator<Integer> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Now reading in reverse ");
		ListIterator<Integer> lsitr = data.listIterator(data.size());
		while (lsitr.hasPrevious()) {
			System.out.println(lsitr.previous());
		}
	}
}
