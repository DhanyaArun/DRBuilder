package org.resume.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {

	WebDriver driver;
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("http://167.71.226.96/sampleform");
		driver.manage().window().maximize();
		
		
	}
}
