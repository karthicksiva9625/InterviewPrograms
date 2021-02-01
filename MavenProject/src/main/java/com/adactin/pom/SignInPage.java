package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	public static WebDriver driver;
	
/*	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("svccom@gmail.com");
	WebElement pass = driver.findElement(By.id("passwd"));
	pass.sendKeys("1234567");
	WebElement submitButton= driver.findElement(By.id("SubmitLogin")); 
	submitBut.click(); */
	 
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitButton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public SignInPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	













}
