package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	public static WebDriver driver;

	@FindBy(xpath = "(//a[@title='Women'])[1]")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirts;

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement quickView;

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;

	@FindBy(xpath = "//a[@data-field-qty='qty'][2]")
	private WebElement qty;

	@FindBy(id = "group_1")
	private WebElement size;

	@FindBy(id = "color_14")
	private WebElement color;

	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addToCartbutton;

	public AddToCartPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
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

	public WebElement getFrame() {
		return frame;
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
}