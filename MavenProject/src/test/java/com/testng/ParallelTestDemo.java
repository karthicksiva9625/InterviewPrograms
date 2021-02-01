package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo {

	@Test
	private void openGoogle() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MavenProjects\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	private void openGoogle1() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MavenProjects\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");

	}

}
