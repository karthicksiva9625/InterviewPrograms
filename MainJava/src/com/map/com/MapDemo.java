package com.map.com;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, Object> m = new HashMap<Integer, Object>();
		m.put(1, "Java");
		m.put(2, 3456);
		m.put(3, "python");
		m.put(4, 1234);
		m.put(5, "Oracle");
		m.put(6, "C");
		m.put(2, 4567);
		m.put(7, "C");
		m.put(null, "C");
		m.put(null, "D");
		m.put(6, null);
		m.put(7, null);

		System.out.println(m);

	}

}
