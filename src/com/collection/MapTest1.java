package com.collection;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest1 {

	public static void main(String[] args) {

		// HashMap<Integer, String> map = new HashMap<Integer, String>();
		// LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(121, "Prabhu");
		map.put(101, "Angel");
		map.put(105, "Hansa");
		map.put(89, "Praful");
		// map.put(null, "Jaya");
		map.put(99, "Angel");

		System.out.println(map);

		java.util.Set<Integer> keys = map.keySet();
		for (int key : keys) {
			System.out.println(key + " ==> " + map.get(key));
		}

		System.out.println("Reading values from the entry");
		java.util.Set<Entry<Integer, String>> rows = map.entrySet();

		for (Entry<Integer, String> row : rows) {
			System.out.println(row.getKey() + "<==>" + row.getValue());
		}

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.addAll(map.values());
		System.out.println(arrayList);

	}

}