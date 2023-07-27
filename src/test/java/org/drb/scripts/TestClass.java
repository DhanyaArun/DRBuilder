package org.drb.scripts;

import java.io.IOException;

import org.drb.pages.LoginPage;
import org.drb.utilities.ExcelUtility;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


@Test
public class TestClass extends TestBase
{
  LoginPage log;
  
  
  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }


	@Test
	public void titleCheck()
	{
		log=new LoginPage(driver);
		String actualTitle=log.Login();
		String expectedTitle="DRB-Digital Resume Builder";
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	
	//Testing with valid username and password by ticking the Remember me checkbox
	
	@Test
	public void  verifyValidLogin() throws IOException
	{
		//Dhanya
	log=new LoginPage(driver);
	String Username=ExcelUtility.getData(0, 0);
	String Password=ExcelUtility.getData(0, 1);
	log.SignupClick();
	log.setUsername(Username);
	log.setPassword(Password);
	log.RememberClick();
	log.LoginClick();
	//log.LogoutClick();
	//log.AboutUsClick();
	//log.TemplateClick();
	//log.MyProfile();
	//log.createResume();
	//String actualresult=log.getLogoText();
	//System.out.println(actualresult);
	//Assert.assertEquals(actualresult,"http://167.71.226.96/login");
	
	
}
	//Testing with valid username and password without ticking the Remember me checkbox

	@Test
	public void verifyUncheckRemember() throws IOException
	{
		log=new LoginPage(driver);
		String Username1=ExcelUtility.getData(0, 0);
		String Password1=ExcelUtility.getData(0,1);
		log.SignupClick();
		log.setUsername(Username1);
		log.setPassword(Password1);
		log.LoginClick();	
		String actualresult=log.getLogoText();
		Assert.assertEquals(actualresult, "LOGOUT");
		
	}
	
	
	//Testing with invalid username and valid password
	
	@Test
	public void verifyInvalidUsername() throws IOException
	{
		log=new LoginPage(driver);
		log.SignupClick();
		String Username1=ExcelUtility.getData(1,0);
		String Password1=ExcelUtility.getData(1,1);
	
		log.setUsername(Username1);
		log.setPassword(Password1);
		log.RememberClick();
		log.LoginClick();	
		String actualresult=log.getLogoText();
		Assert.assertEquals(actualresult, "LOGOUT");
	}
	
	
	//Testing with invalid username and invalid password
	 
		 
	 @Test
	 
	public void verifyInvalid() throws IOException
	
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(2, 0);
		String Password=ExcelUtility.getData(2, 2);
		log.SignupClick();
		log.setUsername(Username);
		log.setPassword(Password);
		log.RememberClick();
		log.LoginClick();
	
	}
}
