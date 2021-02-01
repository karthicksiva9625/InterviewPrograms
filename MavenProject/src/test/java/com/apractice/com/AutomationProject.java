package com.apractice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.adactin.pom.HomePage;
import com.adactin.pom.SignInPage;
import com.baseclass.com.BaseClass1;
import com.pom.com.AddToCartDemo;
import com.pom.com.HomePageDemo;
import com.pom.com.ProceedDemo;
import com.pom.com.SignInPageDemo;

public class AutomationProject extends BaseClass1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\karthick
		// rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		// driver.get("http://automationpractice.com/index.php");
		// driver.manage().window().maximize();
		
		 driver = getBrowser("chrome");
		 getUrl("http://automationpractice.com/index.php");
		
		HomePageDemo hp1=new HomePageDemo(driver);
		ClickOnElement(hp1.getSignIn());
		
		SignInPageDemo sp1=new SignInPageDemo(driver);
		inputToElement(sp1.getEmail(), "svccom@gmail.com");
		inputToElement(sp1.getPass(), "1234567");
		ClickOnElement(sp1.getSubmitBut());
		
		AddToCartDemo ad=new AddToCartDemo(driver);
		moveToElement(ad.getWomen());
		moveToElement(ad.getTshirts());
		ClickOnElement(ad.getTshirts());
		ClickOnElement(ad.getQuickView());
		framesIndex(0);
		ClickOnElement(ad.getQty());
		selectDropDown(ad.getSize(), "value", "2");
		ClickOnElement(ad.getSize());
		ClickOnElement(ad.getColor());
		ClickOnElement(ad.getAddToCartbutton());
		
		ProceedDemo pd=new ProceedDemo(driver);
		Thread.sleep(5000);
		ClickOnElement(pd.getPro1());
		Thread.sleep(5000);
		ClickOnElement(pd.getPro2());
		Thread.sleep(5000);
		ClickOnElement(pd.getPro3());
		Thread.sleep(5000);
		ClickOnElement(pd.getCheckbox());
		Thread.sleep(5000);
		ClickOnElement(pd.getPro4());
		Thread.sleep(5000);
		ClickOnElement(pd.getCheque());
		Thread.sleep(5000);
		ClickOnElement(pd.getOrder());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	/*	driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement signIn = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		ClickOnElement(signIn);

		WebElement email = driver.findElement(By.id("email"));
		inputToElement(email, "svccom@gmail.com");

		WebElement pass = driver.findElement(By.id("passwd"));
		inputToElement(pass, "1234567");

		WebElement submitBut = driver.findElement(By.id("SubmitLogin"));
		ClickOnElement(submitBut);

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
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
		ClickOnElement(addToCartbutton);
		
		Thread.sleep(5000);
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
		
		
		
		
		
		
		
		

		
		
		
		 
		 
		 
		 
		
		
		
		

		/*
		 * Thread.sleep(2000); WebElement signIn =
		 * driver.findElement(By.xpath("//a[@title='Log in to your customer account']"))
		 * ; signIn.click();
		 * 
		 * Thread.sleep(2000); WebElement email = driver.findElement(By.id("email"));
		 * email.sendKeys("svccom@gmail.com");
		 * 
		 * Thread.sleep(2000); WebElement pass = driver.findElement(By.id("passwd"));
		 * pass.sendKeys("1234567");
		 * 
		 * Thread.sleep(2000); WebElement submitBut =
		 * driver.findElement(By.id("SubmitLogin")); submitBut.click();
		 * 
		 * Thread.sleep(2000); WebElement women =
		 * driver.findElement(By.xpath("//a[@title='Women']")); Actions ac = new
		 * Actions(driver); ac.moveToElement(women).perform();
		 * 
		 * Thread.sleep(2000); WebElement tshirts =
		 * driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]")); Actions ac1 =
		 * new Actions(driver); ac1.moveToElement(tshirts).perform(); tshirts.click();
		 * 
		 * Thread.sleep(2000); WebElement quickView =
		 * driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		 * quickView.click();
		 * 
		 * driver.switchTo().frame(0); WebElement qty = driver.findElement(By.
		 * xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		 * qty.click(); qty.click();
		 * 
		 * Thread.sleep(2000); WebElement size = driver.findElement(By.id("group_1"));
		 * Select s = new Select(size); s.selectByValue("2");
		 * 
		 * Thread.sleep(2000); WebElement color = driver.findElement(By.id("color_14"));
		 * color.click();
		 * 
		 * Thread.sleep(2000); WebElement addToCartbutton =
		 * driver.findElement(By.xpath("//button[@class='exclusive']"));
		 * addToCartbutton.click();
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * Thread.sleep(3000); WebElement pro1 = driver.findElement(By.
		 * xpath("//a[@class='btn btn-default button button-medium']")); pro1.click();
		 * 
		 * Thread.sleep(3000); WebElement pro2 =
		 * driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		 * pro2.click();
		 * 
		 * Thread.sleep(3000); WebElement pro3 =
		 * driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		 * pro3.click();
		 * 
		 * 
		 * WebElement cbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 * cbox.click();
		 * 
		 * WebElement pro4 =
		 * driver.findElement(By.xpath("(//button[@type='submit'])[2]")); pro4.click();
		 * 
		 * 
		 * WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
		 * cheque.click();
		 * 
		 * WebElement order =
		 * driver.findElement(By.xpath("//span[text()='I confirm my order']")); String
		 * text = order.getText(); System.out.println(text); order.click();
		 * 
		 * String alertmsg =
		 * driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		 * System.out.println(alertmsg);
		 */

	}

}
