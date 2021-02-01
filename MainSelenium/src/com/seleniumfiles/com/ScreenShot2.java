package com.seleniumfiles.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(5000);
		WebElement logIn = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(logIn).perform();
		ac.click(logIn).perform();
		System.out.println("login clicked");
		
		
		
		Thread.sleep(4000);
		WebElement sports = driver.findElement(By.xpath("//span[text()='Sports, Books & More']"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(sports).perform();
		ac1.click(sports).perform();
		System.out.println("sports clicked");
		
		
		Thread.sleep(4000);
		WebElement cricket = driver.findElement(By.xpath("//a[@title='Sports']"));
		Actions ac2=new Actions(driver);
		ac2.moveToElement(cricket).perform();
		ac2.click(cricket).perform(); 
		System.out.println("cricket clicked");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dsc=new File("C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\ScreenShot\\cricket.png");
		FileUtils.copyFile(src, dsc);
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
