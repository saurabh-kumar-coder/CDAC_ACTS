package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNgButtonClick {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void checkBoxTest() throws InterruptedException {
		driver.get("https://artoftesting.com/samplesiteforselenium");

		driver.findElement(By.id("fname")).sendKeys("saurabh");

		driver.findElement(By.id("idOfButton")).click();
		Thread.sleep(5000);
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}
}
