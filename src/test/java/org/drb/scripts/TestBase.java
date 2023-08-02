package org.drb.scripts;

//import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class TestBase
{
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("http://167.71.226.96/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	/*@AfterTest
	public void afterTest()
	{
	driver.quit();
	}*/
}

