package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNgCheckBox {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void checkBoxTest() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox =  driver.findElement(By.tagName("input"));
		
		checkbox.click();
//		assert checkbox.isSelected();
		
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}
}







