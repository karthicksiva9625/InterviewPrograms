package com.list.com;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
	
	
	List<Integer>l1=new LinkedList<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(400);
	l1.add(500);
	l1.add(400);
	l1.add(100);
	l1.add(null);
	
	System.out.println("LinkedList Original elements are:"+l1);
	
	

}
}