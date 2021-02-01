package com.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationProject {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		signIn.click();

		Thread.sleep(2000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("svccom@gmail.com");

		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("1234567");

		Thread.sleep(2000);
		WebElement submitBut = driver.findElement(By.id("SubmitLogin"));
		submitBut.click();

		Thread.sleep(2000);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();

		Thread.sleep(2000);
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(tshirts).perform();
		tshirts.click();

		Thread.sleep(2000);
		WebElement quickView = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		quickView.click();

		driver.switchTo().frame(0);
		WebElement qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		qty.click();
		qty.click();

		Thread.sleep(2000);
		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByValue("2");

		Thread.sleep(2000);
		WebElement color = driver.findElement(By.id("color_14"));
		color.click();

		Thread.sleep(2000);
		WebElement addToCartbutton = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addToCartbutton.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		WebElement pro1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		pro1.click();
		
		Thread.sleep(3000);
		WebElement pro2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		pro2.click();
		
		Thread.sleep(3000);
		WebElement pro3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		pro3.click();
		
		
		WebElement cbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		cbox.click();
		
		WebElement pro4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		pro4.click();
		
		
		WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		cheque.click();		
		
		WebElement order = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		String text = order.getText();
		System.out.println(text);
		order.click();
		
		String alertmsg = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		System.out.println(alertmsg);
		
		
		
	
	}
	
	
	
}
