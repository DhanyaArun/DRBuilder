package org.ict.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	WebDriver driver;
	@BeforeTest
	public void setUP() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("http://167.71.226.96/sampleform");
		driver.manage().window().maximize();
		Thread.sleep(1000);
			
	}
	
@AfterTest
public void TearDown()
{
	driver.quit();
}

}
