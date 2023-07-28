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
	private WebElement logoutclick;
	private WebElement aboutus;
	private WebElement template;
	private WebElement profile;
	private WebElement logout;
	
	
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
          logoutclick = driver.findElement(By.xpath("//a[text()='Logout']"));
          logoutclick.click();
}
	
	
	//About us
	
	public void AboutUsClick() 
	{
		// TODO Auto-generated method stub
		
		aboutus=driver.findElement(By.xpath("//a[text()='Aboutus']"));
		aboutus.click();
	}
		
	
	
	//Templates/Design
	
	public void TemplateClick()
	{
		template=driver.findElement(By.xpath("//a[text()='Templates/Designs']"));
		template.click();
		
	}
	public String getTemplate()
	
	{
	return(driver.getCurrentUrl());	
	}
	
	
	//My Profile
	
	public void MyProfile()
	{
		profile=driver.findElement(By.xpath("//a[@href=\"/profilehome\"]"));
		profile.click();
	}
	public String getProfile()
	{
		return(driver.getCurrentUrl());
	}

     //Create resume
	
	public void createResume()
	{
	createresume=driver.findElement(By.xpath("//a[text()='Create your resume now"));	
	createresume.click();
	}
	
	
	
		
	}


