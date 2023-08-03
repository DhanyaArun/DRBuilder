package org.mns.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Edit.Pages.Edit;
import com.Edit.Pages.Edit_Resumepage;

//import utility.excelutility;

public class testclass extends testbase

{
	Edit_Resumepage er;
	Edit ed;
	
	
	@Test 
		public void verifyCreateResumePage() throws IOException
		{
		    ed=new Edit(driver);
		    ed.editprofile_click();
		    er=new Edit_Resumepage(driver);
		   
		    
		    er.setFullname("heera");
		    er.setDOB();
		    er.GenderClick();
		    er.setMail("arunnakulan2017@gmail.com");
		    er.setMob();
		    er.setBoard();
		    er.setPercentage();
		    er.setSchoolname();
		    er.setyear();
		    er.AddProjectClick();
		    er.AddTitle("ProjectName");
		    er.AddDescp("ProjectDescription");
		    er.AddQualificationClick();
		    er.AddCourseClick();
		    er.SlectCourseClick();
		    er.AddCourseName("CourseName");
		    er.AddPersentage("22");
		    er.AddJobExperienceClick();
		    er.AddJobTitle("jobtitle");
		    er.AddFromYear("2019");
		    er.AddToYear("2023");
		    er.AddYourSkilsClick();
		    er.AddYourSkil("skill");
		    er.AddLanguageClick();
		    er.AddLanguageKnown("Malayalam");
		    er.AddPrgLanguageClick();
		    er.AddLanguageName("C++");
		    er.AddLanguagePersentage("30%");
		    er.AddYourAchievClick();
			er.AddYourAchievement("achievement");
			er.AddDescribeClick();
			er.AddDescribeYour("describe");
		    er.AddUpdateclick();
		    
		 }

	 




}
