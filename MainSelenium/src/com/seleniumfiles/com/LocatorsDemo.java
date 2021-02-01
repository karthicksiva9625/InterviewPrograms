package com.seleniumfiles.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Class<? extends WebDriver> class1 = driver.getClass();
		System.out.println(class1);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("abc@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		
		WebElement login = driver.findElement(By.tagName("button"));
		login.click();
		
		
	
	
	
	
	
	}

}
