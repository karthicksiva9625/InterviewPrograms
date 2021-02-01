package com.testng;

import org.testng.annotations.*;

public class SimpleAnot1 {
	
	@BeforeSuite
	private void setUp() {
		System.out.println("setup");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("enterUrl");

	}
	@BeforeClass
	private void enterUrl() {
		System.out.println("searchLaptop");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("searchLaptop");

	}
	@Test
	private void searchMobile() {
		System.out.println("searchMobile");
	}
	
	@AfterMethod
	private void verifyHomepage() {
		System.out.println("verifyHomepage");
	}
	
	@AfterClass
	private void logOut() {
		System.out.println("logOut");
	}
	
	@AfterTest
	private void closeBrowser() {
		System.out.println("closeBrowser");

	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("deleteCookies");

	}
	
	
	
	

}
