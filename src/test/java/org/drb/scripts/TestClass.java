package org.drb.scripts;

import java.io.IOException;

import org.apache.logging.log4j.util.Constants;
import org.drb.constants.AutomationConstants;
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
  

  
//Checking the Title
  
	@Test(description = "Testcase 1")
	
	public void titleCheck()
	{
			
		log=new LoginPage(driver);
		String actualTitle=log.Login();	
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, AutomationConstants.ExpectedTitle);
	}

	
	//Testing with valid username and password by ticking the Remember me checkbox
	
	@Test(description = "Testcase 2")
	public void  verifyValidLogin() throws IOException, InterruptedException
	{
		
	log=new LoginPage(driver);
	String Username=ExcelUtility.getData(0, 0);
	String Password=ExcelUtility.getData(0, 1);
	log.SignupClick();
	Thread.sleep(500);
	log.setUsername(Username);
	Thread.sleep(500);
	log.setPassword(Password);
	Thread.sleep(500);
	log.RememberClick();
	Thread.sleep(500);
	log.LoginClick();	
	Thread.sleep(1000);
	String actualText=log.getLogin();
	System.out.println(actualText);
	Assert.assertEquals(actualText,AutomationConstants.ExpectedText);
	
	
}
	//Testing with valid username and password without ticking the Remember me checkbox

	@Test(description = "Testcase 3")
	public void verifyUncheckRemember() throws IOException, InterruptedException
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(0, 0);
		String Password=ExcelUtility.getData(0,1);
		log.SignupClick();
		Thread.sleep(500);
		log.setUsername(Username);
		Thread.sleep(500);
		log.setPassword(Password);
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(500);
		String actualUrl=log.invalidCheck();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,AutomationConstants.expectedUrl);
	}
	
	
	//Testing with invalid username and valid password
	
	@Test(description = "Testcase 4")
	public void verifyInvalidUsername() throws IOException, InterruptedException
	{
		
		log=new LoginPage(driver);
		log.SignupClick();
		Thread.sleep(500);
		String Username1=ExcelUtility.getData(1,0);
		String Password1=ExcelUtility.getData(1,1);
	
		log.setUsername(Username1);
		Thread.sleep(500);
		log.setPassword(Password1);
		Thread.sleep(500);
		log.RememberClick();
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(500);
		String actualUrl=log.invalidCheck();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,AutomationConstants.expectedUrl);
	}
	
	
	//Testing with invalid username and invalid password
	 
		 
	 @Test(description = "Testcase 5")
	 
	public void verifyInvalid() throws IOException, InterruptedException
	
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(2, 0);
		String Password=ExcelUtility.getData(2, 2);
		log.SignupClick();
		Thread.sleep(500);
		log.setUsername(Username);
		Thread.sleep(500);
		log.setPassword(Password);
		Thread.sleep(500);
		log.RememberClick();
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(500);
		String actualUrl=log.invalidCheck();
		System.out.println(actualUrl);
		Assert.assertEquals(actualUrl,AutomationConstants.expectedUrl);
	}
	 
	 //Testing of 'About Us' button
	 
	 @Test(description = "Testcase 6")
	 
	 public void AboutUs() throws IOException, InterruptedException
	 {
		 log=new LoginPage(driver);
			String Username=ExcelUtility.getData(0, 0);
			String Password=ExcelUtility.getData(0,1);
			log.SignupClick();
			Thread.sleep(500);
			log.setUsername(Username);
			Thread.sleep(500);
			log.setPassword(Password);
			Thread.sleep(500);
			log.RememberClick();
			Thread.sleep(500);
			log.LoginClick();
			Thread.sleep(500);
			log.AboutUsClick();
			Thread.sleep(500);
			//String actualurl=log.CheckAbout();
			//Assert.assertEquals(actualurl,AutomationConstants.expectedurl);
	 }
	
	 //Testing of 'Templates/Design' button
	 
	@Test(description = "Testcase 7")
	
	public void Templates() throws IOException, InterruptedException
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(0, 0);
		String Password=ExcelUtility.getData(0,1);
		log.SignupClick();
		Thread.sleep(500);
		log.setUsername(Username);
		Thread.sleep(500);
		log.setPassword(Password);
		Thread.sleep(500);
		log.RememberClick();
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(1000);
		log.TemplateClick();
		Thread.sleep(500);
		String Actualtemplate=log.getTemplate();
		Assert.assertEquals(Actualtemplate,AutomationConstants.ExpectedTemplate);
	}
	
	//Testing of 'My Profile' button
	
	@Test(description = "Testcase 8")
	
	public void MyProfilePage() throws IOException, InterruptedException
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(0, 0);
		String Password=ExcelUtility.getData(0,1);
		log.SignupClick();
		Thread.sleep(500);
		log.setUsername(Username);
		Thread.sleep(500);
		log.setPassword(Password);
		Thread.sleep(500);
		log.RememberClick();
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(500);
		log.MyProfile();
		Thread.sleep(500);
		String ActualProfile=log.getProfile();
		Assert.assertEquals(ActualProfile,AutomationConstants.ExpectedProfile);
	}
	
	
	//Testing of 'Create your Resume now' button
	
	@Test(description = "Testcase 9")
	
	public void CreateResumeButton() throws IOException, InterruptedException
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(0, 0);
		String Password=ExcelUtility.getData(0,1);
		log.SignupClick();
		Thread.sleep(500);
		log.setUsername(Username);
		Thread.sleep(500);
		log.setPassword(Password);
		Thread.sleep(500);
		log.RememberClick();
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(500);
		log.createResume();
		Thread.sleep(500);
		WebElement Actualbutton=log.getCreateButton();
		Assert.assertEquals(Actualbutton,AutomationConstants.ExpectedButton);
	}
	
	
	//Testing of 'Logout' button
	
	@Test(description = "Testcase 10")
	
	public void LogoutCheck() throws IOException, InterruptedException
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(0, 0);
		String Password=ExcelUtility.getData(0,1);
		log.SignupClick();
		Thread.sleep(500);
		log.setUsername(Username);
		Thread.sleep(500);
		log.setPassword(Password);
		Thread.sleep(500);
		log.RememberClick();
		Thread.sleep(500);
		log.LoginClick();
		Thread.sleep(500);
		log.LogoutClick();
		Thread.sleep(500);
		String Actualurl=log.getLogout();
		Assert.assertEquals(Actualurl,AutomationConstants.Expectedurl);
	}
}
