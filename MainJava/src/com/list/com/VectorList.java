package com.list.com;

import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {

		List<Object> l1 = new Vector<>();
		l1.add("A100A");
		l1.add("B200B");
		l1.add("C300C");
		l1.add("D400D");
		l1.add("E500E");
		l1.add(null);
		l1.add(null);
		l1.add("A100A");
		System.out.println(l1);

	}
}