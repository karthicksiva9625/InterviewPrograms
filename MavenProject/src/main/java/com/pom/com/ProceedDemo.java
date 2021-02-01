package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedDemo {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement pro1;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement pro2;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement pro3;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement pro4;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement order;

	
	public ProceedDemo(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getPro1() {
		return pro1;
	}

	public WebElement getPro2() {
		return pro2;
	}

	public WebElement getPro3() {
		return pro3;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getPro4() {
		return pro4;
	}

	public WebElement getCheque() {
		return cheque;
	}

	public WebElement getOrder() {
		return order;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Thread.sleep(5000);
	WebElement pro1 = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	ClickOnElement(pro1);
	
	Thread.sleep(5000);
	WebElement pro2 =driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	ClickOnElement(pro2);
	
	Thread.sleep(5000);
	WebElement pro3=driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	ClickOnElement(pro3);
	
	Thread.sleep(5000);
	WebElement checkbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
	ClickOnElement(checkbox);
	
	Thread.sleep(5000);
	WebElement pro4 =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	ClickOnElement(pro4);
	
	Thread.sleep(5000);
	WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
	ClickOnElement(cheque);
	
	Thread.sleep(5000);
	WebElement order=driver.findElement(By.xpath("//span[text()='I confirm my order']"));
	ClickOnElement(order); */
	


















}
