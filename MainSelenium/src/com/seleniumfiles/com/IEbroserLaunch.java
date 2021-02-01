package com.seleniumfiles.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbroserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
	     //	Class<? extends WebDriver> class1 = driver.getClass();
	     //System.out.println(class1);
		
		  //driver.close();
	
	
	
	
	
	
	
	
	
	
	
	}

}
