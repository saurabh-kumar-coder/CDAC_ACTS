package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNgDoubleClickButton {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void DoubleClickButtonTest() throws InterruptedException {
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Actions act = new Actions(driver);
		
		WebElement dCButton = driver.findElement(By.id("dblClkBtn"));

		act.doubleClick(dCButton).perform();
		
		Thread.sleep(5000);
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}
}
