package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOut {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement pro1;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement pro2;
	
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement pro3;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement cbox;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement pro4;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement order;
	
	

	


	public ProceedToCheckOut(WebDriver ldriver) {
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

	
	public WebElement getCbox() {
		return cbox;
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

	
	
	
	
	
	
	
	
	
	

}
