package com.set.com;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();
		s1.add(101);
		s1.add(102);
		s1.add(103);
		s1.add(104);
		s1.add(105);
		s1.add(101);
		s1.add(103);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		System.out.println("HashSet Elements are:" + s1);
		
		int size = s1.size();
		System.out.println(size);

	}

}
