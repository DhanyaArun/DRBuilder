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
	private WebElement logintext;
	private WebElement createresume;
	private WebElement logoutclick;
	private WebElement aboutus;
	private WebElement template;
	private WebElement profile;
	private WebElement logout;
	private WebElement createbutton;
	
	
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
		username.clear();

	}
	
	public void setPassword(String passwordstr) 
	{
		password=driver.findElement(By.name("pass"));
		password.sendKeys(passwordstr);
		password.clear();
	
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
	
	public String getLogin()
	{
		return(driver.getCurrentUrl());
			
	}
	
	
	public String invalidCheck() 
	{
		return(driver.getCurrentUrl());
	}
	
	//Logout
	
	public void LogoutClick() 
	{
          logoutclick = driver.findElement(By.xpath("//a[text()='Logout']"));
          logoutclick.click();
}
	
	public String getLogout()
	{
		return(driver.getCurrentUrl());
	}
	
	
	
	//About us
	
	public void AboutUsClick() 
	{
		// TODO Auto-generated method stub
		
		aboutus=driver.findElement(By.xpath("//a[text()='Aboutus']"));
		aboutus.click();
	}
		
	public String CheckAbout() 
	{
		return(driver.getCurrentUrl());
	}
	
	//Templates/Design
	
	public void TemplateClick()
	{
		template=driver.findElement(By.xpath("//a[@routerlink='templatehome' and @class='nav-link' and @href='/templatehome']"));
		template.click();
		//System.out.println("Template");
		
	}
	public String getTemplate()
	
	{
	return(driver.getCurrentUrl());	
	}
	
	
	//My Profile
	
	public void MyProfile()
	{
		profile=driver.findElement(By.xpath("//a[@routerlink='/profilehome' and @class='nav-link' and @href='/profilehome']"));
		profile.click();
	}
	public String getProfile()
	{
		return(driver.getCurrentUrl());
	}

     //Create resume
	
	public void createResume()
	{
	createresume=driver.findElement(By.xpath("//a[@class=\\\"contact_bt\\\" and @href=\\\"/templatehome\\]"));	
	createresume.click();
	}
	
	public WebElement getCreateButton()
	{
		createbutton=driver.findElement(By.xpath("//div[text()='Here you can choose your Template/Design']"));
		return createbutton;
	}
	
	
		
	}


