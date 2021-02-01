package com.testng;

import org.testng.annotations.Test;

public class DependencyDemo {
	
	@Test(enabled = false)
	private void highSchool() {
		System.out.println("10th");
	}
	
	@Test(dependsOnMethods = "highSchool")
	private void higherSecondary() {
		System.out.println("12th");
	}
	
	@Test(dependsOnMethods = "higherSecondary")
	private void college() {
		System.out.println("college");
	}
	














}
