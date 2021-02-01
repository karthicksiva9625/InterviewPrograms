package com.set.com;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		Set<String> s1 = new TreeSet<String>();
		s1.add("GREEN");
		s1.add("ORANGE");
		s1.add("WHITE");
		s1.add("RED");
		s1.add("YELLOW");
		s1.add("GREEN");
		s1.add("APPLE");
		System.out.println(s1);

	}
}
