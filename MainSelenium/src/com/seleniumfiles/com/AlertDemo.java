package com.seleniumfiles.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your browser page url is :"+currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		WebElement simpleAlertwithOK = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		simpleAlertwithOK.click();
		
		Thread.sleep(2000);
		WebElement salertbox = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		salertbox.click();
		
		Thread.sleep(2000);
		Alert salert = driver.switchTo().alert();
		salert.accept();
		
		Thread.sleep(2000);
		WebElement confirmAlert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirmAlert.click();
		
		Thread.sleep(2000);
		WebElement calertbox = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		calertbox .click();
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		Thread.sleep(2000);
		WebElement promptalert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promptalert.click();
		
		Thread.sleep(2000);
		WebElement palertbox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		palertbox.click();
		
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("happy");
		alert2.accept();
		
		
		
	
	
	
		
	}

}
