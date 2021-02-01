package com.automation.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelApp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick RS\\eclipse-workspace\\MainSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("karthick123");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12131415");

		WebElement login1 = driver.findElement(By.xpath("//input[@class='login_button']"));
		login1.click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement location = driver.findElement(By.id("location"));
		Select s1 = new Select(location);
		s1.selectByVisibleText("London");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2 = new Select(hotels);
		s2.selectByVisibleText("Hotel Sunshine");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement room = driver.findElement(By.id("room_type"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Deluxe");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement roomNos = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(roomNos);
		s4.selectByVisibleText("3 - Three");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement pickin = driver.findElement(By.id("datepick_in"));
		pickin.sendKeys("31/12/2020");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement pickOut = driver.findElement(By.id("datepick_out"));
		pickOut.sendKeys("5/1/2021");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s5 = new Select(adultRoom);
		s5.selectByIndex(2);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s6 = new Select(childRoom);
		s6.selectByValue("2");

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();

		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Karthick");

		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("RS");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("147/53,Old Mambalam Road,Saidapet,Chennai-600015");

		WebElement creditCard = driver.findElement(By.id("cc_num"));
		creditCard.sendKeys("1413121598765432");

		WebElement cType = driver.findElement(By.id("cc_type"));
		Select s7 = new Select(cType);
		s7.selectByVisibleText("VISA");

		WebElement ccexpDate = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(ccexpDate);
		s8.selectByValue("5");

		WebElement ccexpYear = driver.findElement(By.name("cc_exp_year"));
		Select s9 = new Select(ccexpYear);
		s9.selectByVisibleText("2021");

		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("745");

		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();

	}

}
