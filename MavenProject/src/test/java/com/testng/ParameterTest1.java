package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {

	@Test
	@Parameters({ "username", "password" })
	private void login(@Optional("karthikeyan") String username, @Optional("5555") String password) {

		System.out.println("LOgin Details are:");
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}

}
