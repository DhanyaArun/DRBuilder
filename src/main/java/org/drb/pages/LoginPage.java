package org.drb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage
{
WebDriver driver;
	
	private WebElement signupclick;
	private WebElement username;
	private WebElement password;
	private WebElement remclick;
	private WebElement login;
	private WebElement createresume;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String Login() 
	{
	return(driver.getTitle());
	
	}
	
	
	//Sign Up
	
	public void SignupClick()
	{
		signupclick=driver.findElement(By.xpath("//a[@href=\"/login\"]"));
		signupclick.click();
	}
	
	public void setUsername(String setUser) 
	{
		username=driver.findElement(By.name("Username"));
		username.sendKeys(setUser);
	}
	
	public void setPassword(String passwordstr) 
	{
		password=driver.findElement(By.name("pass"));
		password.sendKeys(passwordstr);
}
	
	public void RememberClick()
	{
		remclick=driver.findElement(By.xpath("//label[@class='label-checkbox100']"));
		remclick.click();
	}
	
	public void LoginClick()
	{
		login=driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		login.click();
	}
	public String getLogoText()
	{
		return(driver.getCurrentUrl());
	}
	
	//Logout
	
	/*public void Logout() 
	{
		logoutclick=driver.findElement(By.xpath("//a[@class='logout btn']");
}*/

//Create resume
	
	public void createResume()
	{
	createresume=driver.findElement(By.xpath("/html/body/app-root/app-home/div/div[1]/div/div/div/div/div/div/div/a"));	
	createresume.click();
	}

}
