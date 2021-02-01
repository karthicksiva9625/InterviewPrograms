package com.testng;

import org.testng.annotations.Test;

public class GroupingDemo {
	
	@Test(groups = "JAVA")
	
	private void java1() {
		System.out.println("JAVA1");

	}
	
	@Test(groups = "SELENIUM")
	private void selenium1() {
		System.out.println("SELENIUM1");
	}
	
	@Test(groups = "JAVA")
	private void java2() {
		System.out.println("JAVA2");

	}
	
	@Test(groups = "SELINIUM")
	private void selenium2() {
		System.out.println("SELINIUM2");
	}
	
	@Test(groups = "JAVA")
	private void java3() {
		System.out.println("JAVA3");
	}
	
	
	
	
	
	

}
