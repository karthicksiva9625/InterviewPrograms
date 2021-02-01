package com.practice.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		// ===FaceBook===
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
		 * 
		 * WebElement email = driver.findElement(By.id("email"));
		 * email.sendKeys("kar123@gmail.com");
		 * 
		 * WebElement pass = driver.findElement(By.id("pass")); pass.sendKeys("123456");
		 * 
		 * WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
		 * login.click();
		 */

		// ===RedBus===

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.redbus.in/"); driver.manage().window().maximize();
		 * 
		 * Thread.sleep(2000); WebElement src = driver.findElement(By.id("src"));
		 * src.sendKeys("Chennai");
		 * 
		 * Thread.sleep(2000); WebElement dest = driver.findElement(By.id("dest"));
		 * dest.sendKeys("Ooty");
		 * 
		 * Thread.sleep(2000); WebElement date =
		 * driver.findElement(By.xpath("//label[text()='Date']")); date.click();
		 * 
		 * Thread.sleep(4000);
		 * driver.findElement(By.xpath("//td[text()='20']")).click();
		 * 
		 * Thread.sleep(2000); WebElement searchbus =
		 * driver.findElement(By.id("search_btn")); searchbus.click();
		 */

		// ===Google===

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * 
		 * WebElement name = driver.findElement(By.name("q"));
		 * name.sendKeys("Greens Technology"); Robot r=new Robot();
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN);
		 * r.keyPress(KeyEvent.VK_ENTER);
		 */

		// ===LakshmiVilasBank===
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.lvbankonline.in/index.html?module=login");
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebElement
		 * usr = driver.findElement(By.id("login_username")); usr.sendKeys("kamal");
		 * 
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * //Thread.sleep(3000); WebElement pass =
		 * driver.findElement(By.id("login_password|input")); pass.sendKeys("123456");
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.lvbankonline.in/index.html?module=login");
		 * driver.manage().window().maximize();
		 * 
		 * //Thread.sleep(10000); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS); WebElement usr =
		 * driver.findElement(By.id("login_username")); usr.sendKeys("karthick");
		 * 
		 * //Thread.sleep(10000); driver.manage().timeouts().implicitlyWait(10,
		 * TimeUnit.SECONDS); WebElement pass =
		 * driver.findElement(By.id("login_password|input")); pass.sendKeys("123456");
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.icicibank.com/");
		 * driver.manage().window().maximize();
		 * 
		 * Thread.sleep(4000); WebElement logCk =
		 * driver.findElement(By.id("login-btn")); logCk.click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); WebElement
		 * usr = driver.findElement(By.id("DUMMY1")); usr.sendKeys("sathish");
		 * usr.click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); WebElement
		 * pass= driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		 * pass.sendKeys("12345");
		 * 
		 * 
		 * //(//div[@class='selectedTxt'])[1]
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * List<WebElement> ls =
		 * driver.findElements(By.xpath("(//div[@class='newListSelected'])[1]")); for
		 * (int i = 0; i <ls.size(); i++) { if
		 * (ls.get(i).getText().contains("Dashboard")) {
		 * System.out.println("contains text"); Thread.sleep(5000); ls.get(3).click(); }
		 * }
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://twitter.com/?lang=en");
		 * driver.manage().window().maximize();
		 * 
		 * WebElement login = driver.findElement(By.xpath("(//div[@dir='auto'])[4]"));
		 * login.click();
		 * 
		 * WebElement email = driver.findElement(By.name("session[username_or_email]"));
		 * email.sendKeys("ramesh");
		 * 
		 * WebElement pass = driver.findElement(By.name("session[password]"));
		 * pass.sendKeys("12345");
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.hdfcbank.com/"); driver.manage().window().maximize();
		 * 
		 * WebElement login =
		 * driver.findElement(By.xpath("(//button[text()='Login'])[2]")); login.click();
		 * 
		 * WebElement login1 = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		 * login1.click();
		 * 
		 * WebElement ck1 =
		 * driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[3]"));
		 * ck1.click();
		 * 
		 * 
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); WebElement
		 * sframe = driver.findElement(By.xpath("//td[text()='NetBanking Login']"));
		 * driver.switchTo().frame(sframe); Thread.sleep(10000); WebElement usr =
		 * driver.findElement(By.id("fldLoginUserId")); usr.sendKeys("ramya");
		 * 
		 * //input[@class='input_password']
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.swiggy.com/"); driver.manage().window().maximize();
		 * 
		 * 
		 * WebElement loc = driver.findElement(By.id("location"));
		 * loc.sendKeys("Chennai");
		 */

/*		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.snapdeal.com/?utm_term=469343806318_57444771733_{bidstrategy}&gclid=EAIaIQobChMIw7TF_oHN7QIVlgsrCh01_grmEAAYASAAEgISwfD_BwE&utm_campaign=brand_account_brandcat_roas_ftu&utm_source=earth_sembrand&utm_medium=snapdeal");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		signin.click();

		Thread.sleep(5000);
		WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
		login.click();

		WebElement sframe = driver.findElement(By.id("loginIframe"));
		driver.switchTo().frame(sframe);

		Thread.sleep(5000);
		WebElement usr = driver.findElement(By.id("userName"));
		usr.sendKeys("7708747532");

		Thread.sleep(5000);
		WebElement conti = driver.findElement(By.id("checkUser"));
		conti.click();
		
		Thread.sleep(5000);
		WebElement usr1 = driver.findElement(By.id("j_username_new"));
		usr1.sendKeys("kvk123@gmail.com");
		

	//	Thread.sleep(5000);
	//	WebElement mno = driver.findElement(By.id("j_number"));
	//	mno.sendKeys("7871789833");

		Thread.sleep(5000);
		WebElement name = driver.findElement(By.id("j_name"));
		name.sendKeys("karti");

		Thread.sleep(5000);
		WebElement dob = driver.findElement(By.id("j_dob"));
		dob.sendKeys("24/12/1996");

		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.id("j_password"));
		pass.sendKeys("56789");
		
		WebElement signup = driver.findElement(By.id("userSignup"));
		signup.click();

	
*/
	
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String t1 = ele.getText();
		System.out.println(t1);
		String b1 = ele.getAttribute(t1);
		System.out.println(b1);
		
		WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		String t2 = tv.getText();
		System.out.println(t2);
		String tg1 = tv.getTagName();
		System.out.println(tg1); */
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		

	



	}}
