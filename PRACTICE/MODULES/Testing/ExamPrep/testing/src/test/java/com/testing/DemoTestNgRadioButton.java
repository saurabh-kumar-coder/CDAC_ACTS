package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNgRadioButton {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void radioButtonTest() throws InterruptedException {
		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement radio = driver.findElement(By.id("male"));

		radio.click();

		Thread.sleep(5000);

		radio = driver.findElement(By.id("female"));
		
		radio.click();

		Thread.sleep(5000);
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}
