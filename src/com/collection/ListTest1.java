package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> evenNos = new ArrayList<Integer>();
		evenNos.add(10);
		evenNos.add(20);
		evenNos.add(30);
		System.out.println("Number of elements: " + evenNos.size());
		System.out.println(evenNos);
		for (int n : evenNos) {
			System.out.println(n);
		}

		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		evenNos.addAll(0, list);
		evenNos.remove(4);
		System.out.println(evenNos);

	}

}
