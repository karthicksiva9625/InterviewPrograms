package com.automation.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
				// driver = new FirefoxDriver();

			} else {
				System.out.println("Invalid BrowserName");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateTo(String Url) {
		try {
			driver.navigate().to("url");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitWait() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void explicitWait(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void fluentWait() {
		try {
			Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
					.ignoring(Exception.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void simpleAlert() {

		try {
			Alert salert = driver.switchTo().alert();
			salert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void confirmAlert() {

		try {
			Alert calert = driver.switchTo().alert();
			calert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void promptAlert(String string) {
		try {
			Alert palert = driver.switchTo().alert();
			palert.sendKeys(string);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement Element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(Element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void robot() throws AWTException {
		{
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	}

	public static void selectDropDown(WebElement element, String value, String option) {
		if (option.equalsIgnoreCase("value")) {
			Select s = new Select(element);
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			Select s1 = new Select(element);
			s1.selectByVisibleText(value);
			{
				// Select s2 = new Select(element);
			}
		} else if (option.equalsIgnoreCase("index")) {
			Select s2 = new Select(element);
			s2.selectByIndex(Integer.parseInt(value));
		}

	}

	public static void inputValuesToElement(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickOnElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void isSelected(WebElement element) {
		try {
			element.isSelected();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getCurrentUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getTitle() {
		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//===Frames===
		public static void frames1(int index) {
			try {
				driver.switchTo().frame(index);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void frames2(String nameOrId) {
			try {
				driver.switchTo().frame(nameOrId);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void frames(WebElement element) {
			try {
				driver.switchTo().frame(element);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void defaultContent() {
			try {
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public static void parentFrame() {
			try {
				driver.switchTo().parentFrame();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


}
