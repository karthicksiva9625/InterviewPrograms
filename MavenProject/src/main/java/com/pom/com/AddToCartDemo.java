package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartDemo {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[1]")
	private WebElement tshirts;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement quickView;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement qty;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="color_14")
	private WebElement color;
	
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement  addToCartbutton;

	
	public AddToCartDemo(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCartbutton() {
		return addToCartbutton;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	Actions ac = new Actions(driver);
	moveToElement(women);

	WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
	Actions ac1 = new Actions(driver);
	ac1.moveToElement(tshirts).perform();
	moveToElement(tshirts);
	ClickOnElement(tshirts);

	WebElement quickView = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	ClickOnElement(quickView);
	
	framesIndex(0);
	
	WebElement qty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
	ClickOnElement(qty);
	ClickOnElement(qty);
	
	 WebElement size = driver.findElement(By.id("group_1"));
	 Select s = new Select(size); 
	 selectDropDown(size, "value","2" );
	 
	 WebElement color = driver.findElement(By.id("color_14"));
	 ClickOnElement(color);
	 
	WebElement  addToCartbutton = driver.findElement(By.xpath("//button[@class='exclusive']"));
	ClickOnElement(addToCartbutton);*/
















}
