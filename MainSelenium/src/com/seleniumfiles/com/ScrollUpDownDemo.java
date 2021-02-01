package com.seleniumfiles.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	/*	//Scrolling some position....
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,450)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-450)", "");
		
		System.out.println("Scrolling some position is completed successfully...");
		
		
		
		//Scrolling to Last bottom page....
		
		Thread.sleep(3000);
		JavascriptExecutor executor1=(JavascriptExecutor) driver;
		executor1.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		Thread.sleep(3000);
		JavascriptExecutor executor2=(JavascriptExecutor) driver;
		executor2.executeScript("window.scroll(0,0)", "");
		
		System.out.println("scroll bottompage is completed....");
		
		//Scrolling to the specific webelement....
		
		//JavascriptExecutor exe=(JavascriptExecutor) driver; */
		
		Thread.sleep(2000);
		WebElement TodayDeals = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(TodayDeals).perform();
		ac.click(TodayDeals).perform();
		
		
		JavascriptExecutor exe=(JavascriptExecutor) driver;
		exe.executeScript("arguments[0].scrollIntoView();",TodayDeals);
		Thread.sleep(2000);
		exe.executeScript("window.scroll(0,500)", "");
		Thread.sleep(2000);
		exe.executeScript("window.scroll(0,-500", "");
		
	
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


















}
