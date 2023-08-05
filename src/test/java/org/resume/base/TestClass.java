package org.resume.base;

import java.io.IOException;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.ictkerala.excel.ExcelUtility;
//import org.openqa.selenium.WebElement;
import org.resume.pages.AddProjectPage;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass extends TestBase{
	
	AddProjectPage ap;
	
	@Test 
	public void verifyAddProjectPage() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddProjectClick();
	}
	
	@Test 
	public void verifyAddProjectTitle() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddTitle("ProjectName");
	}
	
	@Test 
	public void verifyAddProjectDesc() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddDescp("ProjectDescription");
	}
	
	@Test 
	public void verifyAddQualificationPage() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddQualificationClick();
	}
	
	@Test 
	public void verifyAddCoursePage() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddCourseClick();
	}
	
	@Test 
	public void verifySelectCoursePage() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.SlectCourseClick();
	}
	@Test 
	public void verifyCourseName() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddCourseName("CourseName");
	}
	@Test 
	public void verifyPersentage() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddPersentage("22");
	}
	@Test 
	public void verifyJobExpClick() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddJobExperienceClick();
	}
	@Test 
	public void verifyJobTitle() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddJobTitle("jobtitle");
	}
	@Test 
	public void verifyFromYear() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddFromYear("2019");
	}
	@Test 
	public void verifyToYear() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddToYear("2023");
	}
	@Test 
	public void verifyYourSkilClick() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddYourSkilsClick();
	}
	@Test 
	public void verifySkill() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddYourSkil("skill");
	}
	@Test 
	public void verifyLanguageClick() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddLanguageClick();
	}
	@Test 
	public void verifyLanguageKnown() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddLanguageKnown("Malayalam");
	}
	@Test 
	public void verifyPrgLanguageClick() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddPrgLanguageClick();
	}
	@Test
	public void verifyPrgLanguage() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddLanguageName("C++");
	}
	@Test
	public void verifyPrgLangPersent() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddLanguagePersentage("30%");
	}
	@Test 
	public void verifyAchieveClick() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddYourAchievClick();
	}
	@Test
	public void verifyAchievement() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddYourAchievement("achievement");
	}
	@Test 
	public void verifyDescribeClick() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddDescribeClick();
	}
	@Test 
	public void verifyDescribeYour() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.AddDescribeYour("describe");
	}
	@Test 
	public void verifyImageSelection() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.SetChoosefile();
	}

	@Test
	public void Setcheckbox() throws InterruptedException
	{
		
		ap=new AddProjectPage(driver);
		ap.Setcheckbox();
		
	}
	
	@Test
	public void verifyCreateResume() throws IOException
	{
	
		ap=new AddProjectPage(driver);
		ap.CreateResume();
	}
	
}