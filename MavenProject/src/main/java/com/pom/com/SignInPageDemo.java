package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageDemo {
	
	/*WebElement email = driver.findElement(By.id("email"));
	inputToElement(email, "svccom@gmail.com");

	WebElement pass = driver.findElement(By.id("passwd"));
	inputToElement(pass, "1234567");

	WebElement submitBut = driver.findElement(By.id("SubmitLogin"));
	ClickOnElement(submitBut); */

	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pass;
	
	@FindBy(id="SubmitLogin")
	private WebElement submitBut;
	
	
	public SignInPageDemo(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
	} 

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSubmitBut() {
		return submitBut;
	}
	
	

}
