package com.set.com;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {

		Set<String> s1 = new LinkedHashSet<String>();
		s1.add("GREEN");
		s1.add("ORANGE");
		s1.add("WHITE");
		s1.add("RED");
		s1.add("YELLOW");
		s1.add("GREEN");
		s1.add(null);
		System.out.println(s1);

	}
}
