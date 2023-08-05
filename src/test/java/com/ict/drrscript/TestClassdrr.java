package com.ict.drrscript;

import java.io.IOException;

import org.ict.drrpages.Signup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.ict.drrUtilities.ExclUtility;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestClassdrr extends TestBasedrr{
	Signup reg;
	
@Test(priority=1)
	
	public void verifyEmptySignup() throws IOException, Throwable  {
		

		 reg=new Signup(driver);
		String Username="";
		String mail="";
		String Passwrd="";
		String CPasswrd="";
		
		reg.setUsername(Username);
		reg.setMail(mail);
		reg.setPass(Passwrd);
		reg.setCpass(CPasswrd);
				
		reg.Registerclick();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
@Test(priority=2)
	
	public void verifyInvalidSignup() throws IOException, Throwable  {
		reg=new Signup(driver);
		String Username=ExclUtility.getData(1, 0);
		long Phno=ExclUtility.getNumericData(1, 1);
		String mail=ExclUtility.getData(1, 2);
		String Passwrd=ExclUtility.getData(1, 3);
		String CPasswrd=ExclUtility.getData(1, 4);
		
		reg.setUsername(Username);
		reg.setPhno(Phno);
		reg.setMail(mail);
		reg.setPass(Passwrd);
		reg.setCpass(CPasswrd);
				
		reg.Registerclick();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}
	@Test(priority=3)
	
	public void verifyValidSignup() throws IOException, Throwable  {
		reg=new Signup(driver);
		String Username=ExclUtility.getData(0, 0);
		long Phno=ExclUtility.getNumericData(0, 1);
		String mail=ExclUtility.getData(0, 2);
		String Passwrd=ExclUtility.getData(0, 3);
		String CPasswrd=ExclUtility.getData(0, 4);
		
		reg.setUsername(Username);
		WebElement username1 =driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='username']"));
		String expected=Username;
		String actualUsername=username1.getAttribute("value");
		Assert.assertEquals(actualUsername, expected);
		reg.setPhno(Phno);
		
		reg.setMail(mail);
		WebElement mail1 =driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='email_id']"));
		String expectedMail=mail;
		String actualMail=mail1.getAttribute("value");
		Assert.assertEquals(actualMail, expectedMail);
		
		reg.setPass(Passwrd);
		WebElement pass1 =driver.findElement(By.xpath("//input[@type='password' and@formcontrolname='pass1']"));
		String expectedPass=Passwrd;
		String actualPass=pass1.getAttribute("value");
		Assert.assertEquals(actualPass, expectedPass);
		
		reg.setCpass(CPasswrd);
		WebElement CPassd1 =driver.findElement(By.xpath("//input[@type='password' and@formcontrolname='pass2']"));
		String expectedCPass=CPasswrd;
		String actualCPass=CPassd1.getAttribute("value");
		Assert.assertEquals(actualCPass, expectedCPass);
		Thread.sleep(2000);		
		reg.Registerclick();
		Thread.sleep(2000);
		
	}
@Test
	
	public void verifySignupLogin() throws IOException, Throwable  {

	
	String Username=ExclUtility.getData(0, 0);
	String Passwrd=ExclUtility.getData(0, 3);
	 driver=new ChromeDriver();
	 driver.get("http://167.71.226.96/login");
	 driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name=\"Username\"]")).sendKeys(Username);
	driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(Passwrd);
	driver.findElement(By.xpath("//label[@for='checkbox']")).click();
	Thread.sleep(2000);		
	driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[4]/button")).click();
	
}


}
