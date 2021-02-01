package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

	@Test
	@Parameters({ "username", "password" })
	private void login(String username, String password) {
		System.out.println("Login Details are :");
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}

}
