package com.list.com;

import java.util.List;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {

		List<String> l1 = new Stack<String>();
		l1.add("AAA");
		l1.add("BBB");
		l1.add("CCC");
		l1.add("DDD");
		l1.add("EEE");
		l1.add("AAA");
		l1.add("CCC");
		l1.add(null);

		System.out.println(l1);

	}
}