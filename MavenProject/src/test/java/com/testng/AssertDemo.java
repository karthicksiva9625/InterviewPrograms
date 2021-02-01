package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	String actual = "Bala";
	String expected = "bala";

	/*
	 * @Test private void test1() { System.out.println("Test1 Started");
	 * Assert.assertEquals(actual, expected); System.out.println("Test1 Completed");
	 * }
	 */

	@Test
	private void test2() {
		
		SoftAssert s = new SoftAssert();
		System.out.println("Test2 Started");
		s.assertEquals(actual, expected);
		System.out.println("Test2 Completed");
		s.assertAll();
	}

}
