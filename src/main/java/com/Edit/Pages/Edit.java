package com.Edit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edit {
	WebDriver driver;
	WebElement element;
	
	public Edit(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void editprofile_click() throws InterruptedException
	{
		element=driver.findElement(By.xpath("//a[@routerlink='editform']"));
		element.click();
		Thread.sleep(1000);

		
	}

}
