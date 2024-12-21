package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTestNgCheckBoxConditional {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void radioButtonTest() throws InterruptedException {
		driver.get("https://artoftesting.com/samplesiteforselenium");

		WebElement radio1 = driver.findElement(By.className("Automation"));
		WebElement radio2 = driver.findElement(By.className("Performance"));
		if(radio1.isSelected()) {
			radio1.click();			
		} else {
			radio2.click();
		}
		
		Thread.sleep(5000);

		
	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}
