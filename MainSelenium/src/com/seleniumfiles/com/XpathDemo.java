package com.seleniumfiles.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Class<? extends WebDriver> class1 = driver.getClass();
		System.out.println(class1);
		
		Thread.sleep(2000);
		WebElement text1 = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text = text1.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		WebElement text2 = driver.findElement(By.id("reg_pages_msg"));
		String text3 = text2.getText();
		System.out.println(text3);
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123456");
		
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		
		Thread.sleep(2000);
		WebElement text4 = driver.findElement(By.xpath("//div[@class='_9axz']"));
		String text5 = text4.getText();
		System.out.println(text5);
		
		Thread.sleep(2000);
		WebElement text7 = driver.findElement(By.xpath("//div[@id='error_box']"));
		String text6 = text7.getText();
		System.out.println(text6);
		
		Thread.sleep(2000);
		WebElement text8 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text9 = text8.getText();
		System.out.println(text9);
		
		driver.navigate().back();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	













}
