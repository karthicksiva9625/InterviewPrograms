package com.seleniumfiles.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePr {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthick rs\\eclipse-workspace\\MainSelenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		System.out.println("======ALL DATAS======");
		List<WebElement> allDatas = driver.findElements(By.id("customers"));
		for (WebElement data : allDatas) {
			System.out.println(data.getText());
		}

		System.out.println("=====PARTICULAR ROW====");
		List<WebElement> parRow = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]"));
		for (WebElement data : parRow) {
			System.out.println(data.getText());
		}

		System.out.println("=====PARTICULAR COLUMN=====");
		List<WebElement> parCol = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement data : parCol) {
			System.out.println(data.getText());
		}

		System.out.println("=====PARTICULAR COLUMN  HEADER=====");
		List<WebElement> parColHead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th[3]"));
		for (WebElement data : parColHead) {
			System.out.println(data.getText());
		}

		System.out.println("=====PARTICULAR DATA====");
		WebElement parData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		System.out.println(parData.getText());

		System.out.println("===== PAR ROW SIZE=====");
		List<WebElement> rowlen = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int size = rowlen.size();
		System.out.println(size);

		System.out.println("====COLUMN SIZE====");
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int size2 = col.size();
		System.out.println(size2);

		System.out.println("====ROW SIZE====");
		List<WebElement> rsize = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		int size3 = rsize.size();
		System.out.println(size3);

	}

}
