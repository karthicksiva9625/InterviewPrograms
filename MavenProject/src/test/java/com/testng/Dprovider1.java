package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dprovider1 {

	@Test(dataProvider = "loginData1")
	private void login(String username, String password) {
		System.out.println("Enter the Login Details:");
		System.out.println("username :" + username);
		System.out.println("password :" + password);
	}

	@DataProvider
	private Object[][] loginData1() {
		return new Object[][] {

				{ "AAAA", "9999" }, { "BBBB", "2222" }, { "CCCC", "3333" }, { "DDDD", "4444" }

		};

	}

}