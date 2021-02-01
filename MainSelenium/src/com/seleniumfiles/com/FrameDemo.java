package com.seleniumfiles.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement sframe = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(sframe);

		Thread.sleep(2000);
		WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("happy");
		String text = text1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();


		WebElement frame2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		frame2.click();

		WebElement mframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(mframe);
		Thread.sleep(2000);
		WebElement framem = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(framem);

		WebElement mframe1 = driver.findElement(By.tagName("input"));
		mframe1.sendKeys("newyear");
		
		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());

	}

}
