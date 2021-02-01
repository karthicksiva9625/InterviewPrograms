package com.testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleAssert1 {

	@Test(retryAnalyzer = MyRetry.class)
	private void userNameValidation() {
		Assert.assertEquals('a', 'A');
	}

}
