package com.testng;

import org.testng.annotations.Test;

public class ExceptionTestDemo {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void searchMobile() {
		int a=10/0;
		System.out.println(a);
	}

}
