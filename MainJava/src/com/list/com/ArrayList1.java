package com.list.com;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(30);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		boolean contains = l1.contains(10);
		System.out.println("contains :" + contains);
		boolean contains2 = l1.contains(70);
		System.out.println("contains :" + contains2);
		boolean containsAll = l1.containsAll(l1);
		System.out.println("containsAll :" + containsAll);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);

		boolean equals = l1.equals(l2);
		System.out.println("equals :" + equals);

		Integer integer = l1.get(3);
		System.out.println("IndexOf :" + integer);

		int indexOf = l1.indexOf(50);
		System.out.println("indexOf :" + indexOf);

		List<Integer> l3 = new ArrayList<Integer>();

		boolean empty = l3.isEmpty();
		System.out.println("empty :" + empty);

		int lastIndexOf = l1.lastIndexOf(null);
		System.out.println(lastIndexOf);

		System.out.println("l1 Origianl elements are:" + l1);
		l1.set(0, 100);
		l1.set(1, 200);
		l1.set(2, 300);
		l1.set(3, 400);
		l1.set(4, 500);
		System.out.println("l1 replaced elements are:" + l1);

		l1.remove(4);
		System.out.println(l1);

		int size = l1.size();
		System.out.println(size);

		List<Integer> l4 = new ArrayList<Integer>();
		l4.add(100);
		l4.add(200);
		l4.add(300);
		l4.add(400);
		l4.add(500);

		List<Integer> subList = l4.subList(1, 3);
		System.out.println(subList);

	}
}