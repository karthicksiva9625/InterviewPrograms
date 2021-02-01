package com.xpath.com;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbsXpath1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIrfqi6KqY7QIViR0rCh3x0wVbEAAYASAAEgL5g_D_BwE");
		driver.manage().window().maximize();
	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions ac1=new Actions(driver);
		ac1.moveToElement(men).perform();
		
		Thread.sleep(5000);
		WebElement tshirts = driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(tshirts).perform();
		ac.click(tshirts).perform();
		
		//div[@id='desktopSearchResults']/div[2]/section/ul/li/a/div[2]/div/span/li/a//li/a/div[2]/div/span[2]  
}

}
