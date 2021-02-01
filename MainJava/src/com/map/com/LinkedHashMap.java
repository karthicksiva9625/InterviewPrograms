package com.map.com;

import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {

		Map<String, Integer> hm = new java.util.LinkedHashMap<String, Integer>();
		hm.put("BLACK", 1111);
		hm.put("WHITE", 2222);
		hm.put("YELLOW", 3333);
		hm.put("GREEN", 4444);
		hm.put("PINK", 5555);
		hm.put("BLACk", 1111);
		hm.put(null, null);
		hm.put(null, 7777);

		System.out.println(hm);

	}

}
