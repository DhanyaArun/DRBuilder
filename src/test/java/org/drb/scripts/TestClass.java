package org.drb.scripts;

import java.io.IOException;

import org.drb.pages.LoginPage;
import org.drb.utilities.ExcelUtility;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class TestClass extends TestBase
{
  LoginPage log;


	@Test
	public void titleCheck()
	{
		log=new LoginPage(driver);
		String actualTitle=log.Login();
		String expectedTitle="DRB-Digital Resume Builder";
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	
	
	@Test
	public void  verifyValidLogin() throws IOException
	{
	log=new LoginPage(driver);
	String Username=ExcelUtility.getData(0, 0);
	String Password=ExcelUtility.getData(0, 1);
	log.SignupClick();
	log.setUsername(Username);
	log.setPassword(Password);
	log.RememberClick();
	log.LoginClick();
	//log.createResume();
	String actualresult=log.getLogoText();
	System.out.println(actualresult);
	Assert.assertEquals(actualresult,"http://167.71.226.96/login");
	
	
}
	

	//@Test
	/*public void verifyInvalidUsername() throws IOException
	{
		log=new LoginPage(driver);
		String Username1=ExcelUtility.getData(1, 0);
		String Password1=ExcelUtility.getData(1,1);
		log.SignupClick();
		log.setUsername(Username1);
		log.setPassword(Password1);
		log.RememberClick();
		log.LoginClick();	
		String actalresult=log.getLogoText();
		Assert.assertEquals(actalresult, "LOGOUT");
		
	}
	*/
	//@Test
	/*public void verifyInvalidPassword() throws IOException
	{
		log=new LoginPage(driver);
		log.SignupClick();
		String Username1=ExcelUtility.getData(2,0);
		String Password1=ExcelUtility.getData(2,2);
	
		log.setUsername(Username1);
		log.setPassword(Password1);
		log.RememberClick();
		log.LoginClick();	
		String actualresult=log.getLogoText();
		Assert.assertEquals(actualresult, "LOGOUT");
	}
	
	*/
	//@Test
	/*public void verifyCreateResume() throws IOException
	{
		log=new LoginPage(driver);
		String Username=ExcelUtility.getData(0, 0);
		String Password=ExcelUtility.getData(0, 1);
		log.SignupClick();
		log.setUsername(Username);
		log.setPassword(Password);
		log.RememberClick();
		log.LoginClick();
		log.createResume();
	}*/
}
