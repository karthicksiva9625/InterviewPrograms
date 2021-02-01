package com.map.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("AAA", 1111);
		m1.put("BBB", 2222);
		m1.put("CCC", 3333);
		m1.put("DDD", 4444);
		m1.put("EEE", 5555);
		m1.put(null, null);
		m1.put(null, 6666);
		System.out.println(m1);

		Integer int1 = m1.get("AAA");
		System.out.println(int1);

		Set<String> keySet = m1.keySet();
		System.out.println(keySet);

		int size = m1.size();
		System.out.println(size);

		Collection<Integer> values = m1.values();
		System.out.println(values);

	}

}
