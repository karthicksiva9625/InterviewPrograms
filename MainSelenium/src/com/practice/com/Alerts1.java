package com.practice.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		// First Alert:
		WebElement salert = driver.findElement(By.id("alertButton"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		salert.click();

		Alert alert1 = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		alert1.accept();

		// Second Alert
		WebElement salert2 = driver.findElement(By.id("timerAlertButton"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		salert2.click();
		alert1.accept();


	}

}
