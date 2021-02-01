package com.testng;

import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount = 3)
	private void searchTv() {
		System.out.println("searchtv");
	}
	
	@Test(invocationCount = 5)
	private void searchMobile() {
		System.out.println("searchMobile");

	}

}
