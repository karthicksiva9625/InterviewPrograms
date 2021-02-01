package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallellTest1 {

	@Test()

	private void test1() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick RS\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test()
	private void test2() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\karthick RS\\eclipse-workspace\\MavenProject\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}
