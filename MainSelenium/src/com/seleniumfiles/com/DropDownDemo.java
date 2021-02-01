package com.seleniumfiles.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();


		//SINGLE LIST DEMO....

		Thread.sleep(2000);
		WebElement singleDrop = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s1=new Select(singleDrop);
		s1.selectByIndex(2);
		//String text = singleDrop.getText();
		//System.out.println(text);

		//Select By Visible Text...
		Thread.sleep(2000);
		s1.selectByVisibleText("Thursday");
		String text1 = singleDrop.getText();
		System.out.println(text1);


		//Multi-Select List Demo.....

		Thread.sleep(2000);
		WebElement mselect = driver.findElement(By.id("multi-select"));
		Select s2=new Select(mselect);
		boolean multiple = s2.isMultiple();

		if(true==multiple)
		{
			s2.selectByIndex(3);
			s2.selectByValue("Florida");
			s2.selectByVisibleText("New Jersey");

		}

		else {
			System.out.println("not a dropdown");
		}

		System.out.println("AllSelectedOptions");
		List<WebElement> allSelectedOpt = s2.getAllSelectedOptions();
		for (WebElement allSelect : allSelectedOpt) {
			System.out.println(allSelect.getText());
		}


		System.out.println("FirstSelectedOptions");
		WebElement FirstSelectedOpt = s2.getFirstSelectedOption();
		System.out.println(FirstSelectedOpt);


		System.out.println("AllOptions");
		List<WebElement> alloptions = s2.getOptions();
		for (WebElement all : alloptions) {
			System.out.println(all.getText());
			
		}













	}}