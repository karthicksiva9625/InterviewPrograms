package com.seleniumfiles.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Class<? extends WebDriver> class1 = driver.getClass();
		System.out.println(class1);
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		
		System.out.println("Navigate:");
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		System.out.println("Back Navigation");
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		System.out.println("Forward Navigation:");
		String currentUrl4 = driver.getCurrentUrl();
		System.out.println(currentUrl4);
		
		String title4 = driver.getTitle();
		System.out.println(title4);
		
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
