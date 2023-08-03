package org.ict.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
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
	
@AfterTest
public void TearDown()
{
	driver.close();
}

}
