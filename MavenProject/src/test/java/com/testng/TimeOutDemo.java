package com.testng;

import org.testng.annotations.Test;

public class TimeOutDemo {

	@Test(timeOut = 1500)
	private void userId() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("USERID");
	}

	@Test(timeOut = 1000)
	private void passwd() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("PASSWD");
	}

}
