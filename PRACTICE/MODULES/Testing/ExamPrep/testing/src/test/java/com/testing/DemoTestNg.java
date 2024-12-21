package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNg {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void GoogleTestSaurabh1() throws InterruptedException {
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Saurabh Kumar");
		
		Thread.sleep(2000);
	}
	
	@Test
	public void GoogleTestSaurabh2() throws InterruptedException {
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Saurabh Kumar");
		driver.findElement(By.id("APjFqb")).submit();
		
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
}
