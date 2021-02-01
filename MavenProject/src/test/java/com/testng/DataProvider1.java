package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test(dataProvider ="logInData")
	
	private void login(String username, String password) {
		System.out.println("Enter the Login Details:");
		System.out.println("username :"+username);
		System.out.println("password :"+password);

	}

	@DataProvider
	private Object logInData() {
		return new Object[][] { { "aaaa", "2222" }, { "bbbb", "3333" }, { "cccc", "4444" }

		};
	}

}
