package com.testng;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test(priority =5 )
	private void fifthrank5() {
		System.out.println("RANK5");

	}
	@Test(priority = 3)
	private void thirdrank3() {
		System.out.println("RANK3");
	}
	
	@Test(priority = 1)
	private void firstrank1() {
		System.out.println("RANK1");
	}
	
	@Test(priority = 4)
	private void fourthrank4() {
		System.out.println("RANK4");
	}
	
	@Test(priority = 2)
	private void secondrank2() {
		System.out.println("RANK2");
	}

}
