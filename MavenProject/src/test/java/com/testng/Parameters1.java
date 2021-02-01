package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {

	@Test()
	@Parameters({ "userName", "passWord" })
	private void login(@Optional("veeramani") String username, @Optional("3232") String password) {
		System.out.println("Enter the Login Details :");
		System.out.println("username :" + username);
		System.out.println("password :" + password);
	}

}
