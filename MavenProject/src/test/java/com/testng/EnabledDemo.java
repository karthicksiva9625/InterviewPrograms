package com.testng;

import org.testng.annotations.Test;

public class EnabledDemo {
	
	@Test(enabled = false)
	private void searchTv() {
		System.out.println("searchtv");

	}
	
	@Test(enabled = true)
	private void searchMobile() {
		System.out.println("searchmobile");
	}
	
	
	
	}
