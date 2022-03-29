package com.collection;

import java.util.HashSet;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hSet = new HashSet<String>();
//		LinkedHashSet<String> hSet = new LinkedHashSet<String>();
//		TreeSet<String> hSet = new TreeSet<String>();
		hSet.add("apple");
		hSet.add("mango");
		hSet.add("guava");
		hSet.add("grapes");
		hSet.add("banana");
		hSet.add(null);
		for (String element : hSet) {
			System.out.println(element);
		}

//		System.out.println("\nDescending Order");
//		Iterator<String> itr = hSet.descendingIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

	}

}
