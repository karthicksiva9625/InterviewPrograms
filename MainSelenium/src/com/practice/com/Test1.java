package com.practice.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println("First Url name is :"+currentUrl1);
		
		String title1 = driver.getTitle();
		System.out.println("first title  name is :"+title1);
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		String currentUrl2= driver.getCurrentUrl();
		System.out.println("second url name is:"+currentUrl2);
		
		String title2 = driver.getTitle();
		System.out.println("Second title name is :"+title2);
		
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Driver  is quit automatically...");
		
	//	driver.close();
	//	System.out.println("driver is closed now! ");
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
