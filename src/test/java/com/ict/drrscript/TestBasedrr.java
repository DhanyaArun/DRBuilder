package com.ict.drrscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBasedrr {
	WebDriver driver;
	 @BeforeTest
	 public void setUp() {
		 driver=new ChromeDriver();
		 driver.get("http://167.71.226.96/signup");
		 driver.manage().window().maximize();
	
	 }
	/* @AfterTest
		public void afterTest()
		{
			driver.quit();
		}
	*/
}
