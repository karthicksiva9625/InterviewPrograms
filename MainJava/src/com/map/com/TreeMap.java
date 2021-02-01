package com.map.com;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap {

	public static void main(String[] args) {

		Map<String, Number> m1 = new java.util.TreeMap<String, Number>();
		m1.put("ELEPHANT", 1111);
		m1.put("KANGAROO", 2222);
		m1.put("TIGER", 3333);
		m1.put("LION", 4444);
		m1.put("GIRAFFE", 5555);
		// m1.put(null, 6666);
		// m1.put(null, null);

		System.out.println(m1);
		Set<String> keySet = m1.keySet();
		System.out.println(keySet);

		Collection<Number> values = m1.values();
		System.out.println(values);
		
		Set<Entry<String, Number>> entrySet = m1.entrySet();
		System.out.println(entrySet);
		
		
	}

}
