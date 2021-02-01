package com.seleniumfiles.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		System.out.println("======ALL DATAS======");
		List<WebElement> allDatas = driver.findElements(By.id("customers"));
		for (WebElement data1 : allDatas) {
			System.out.println(data1.getText());
		}
		
		System.out.println("======PARTICULAR ROW======");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		for (WebElement pData : findElements) {
			System.out.println(pData.getText());
		}
		
		System.out.println("=====PARTICULAR COLUMN======");
		 List<WebElement> Pcol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/t[2]"));
		 for (WebElement parCol : Pcol) {
			System.out.println(parCol.getText());
		}
	
	
	
	
	
	
	
	
	
	
	}




















}
