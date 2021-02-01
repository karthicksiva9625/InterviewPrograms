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

public class ScreenshotDemo {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mobiles).perform();
		ac.click(mobiles).perform();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dsc=new File("C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\ScreenShot\\sample.png");
		FileUtils.copyFile(src,dsc);
	
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}





















}
