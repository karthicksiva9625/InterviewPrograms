package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDemo {
	
	public static WebDriver driver;
	
	//WebElement signIn =
			// * driver.findElement(By.xpath("//a[@title='Log in to your customer account']"))
			// * ; signIn.click();


	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement signIn;
	
	public HomePageDemo(WebDriver ldriver) {
		this.driver=ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	
	
	
	
	














}
