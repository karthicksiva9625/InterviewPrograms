package com.seleniumfiles.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/"); */
		//driver.manage().window().maximize();
		
		getBrowser("chrome");
		getUrl("https://www.google.com/");
		
		WebElement input = driver.findElement(By.id("input"));
		//input.sendKeys("amazon");
		inputToElement(input, "amazon");
		
		
		
		
		/*String currentUrl = driver.getCurrentUrl();
		System.out.println("your browser page url is :"+currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close(); 
		
		
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		//driver.quit(); */
			
		
		
		}



}
