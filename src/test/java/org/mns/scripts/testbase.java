package org.mns.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testbase {
	WebDriver driver;
	@BeforeTest
	public void setUP()
	{
		driver=new ChromeDriver();
		driver.get("http://167.71.226.96/editform");
		driver.manage().window().maximize();
		
		
	}

}
