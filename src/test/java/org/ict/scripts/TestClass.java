package org.ict.scripts;


import java.io.IOException;

import org.ict.pages.CreateResumePage;
import org.ict.utilities.ExcelUtility;
import org.testng.annotations.Test;

public class TestClass extends TestBase{
	CreateResumePage cr;
	
	@Test (priority = 1)
	public void verifyCreateResumePage() throws IOException, InterruptedException
	{
	
	   	cr=new CreateResumePage(driver);
		String fullname= ExcelUtility.getData(0, 0);
		cr.setFullname(fullname);
		Thread.sleep(500);
		 long dob= ExcelUtility.getNumericData(0, 1);
			cr.setDOB(dob);
		cr.GenderClick();
		Thread.sleep(500);
		String email= ExcelUtility.getData(0, 2);
		cr.setMail(email);
		Thread.sleep(500);
		 long mob= ExcelUtility.getNumericData(0, 3);
		cr.setMobile(mob);
		Thread.sleep(500);
		 cr.setBoard();
		 long pr= ExcelUtility.getNumericData(0, 4);
		 cr.setPercent(pr);
		 String sn= ExcelUtility.getData(0, 5);
		 cr.setSchoolname(sn);
		 long yr= ExcelUtility.getNumericData(0, 6);
		 cr.setYear(yr);
		 cr.setHBoard();
		 long per= ExcelUtility.getNumericData(0, 7);
		 cr.setPercentag(per);
		 String scn= ExcelUtility.getData(0, 8);
		 cr.setSchoolnam(scn);
		 long yrr= ExcelUtility.getNumericData(0, 9);
		 cr.setYears(yrr);
		 cr.setDegree();
		 cr.setCourse();
		 long perc= ExcelUtility.getNumericData(0, 10);
		 cr.setPercenta(perc);
		 String clg= ExcelUtility.getData(0, 11);
		 cr.setInstnam(clg);
		 long yrp= ExcelUtility.getNumericData(0, 12);
		 cr.setYearpass(yrp);
		 cr.setPostgraduate();
		 cr.setPgCourse();
		 long percg= ExcelUtility.getNumericData(0, 13);
		 cr.setPgPercentage(percg);
		 String clgn= ExcelUtility.getData(0, 14);
		 cr.setInstinam(clgn);
		 long yrpg= ExcelUtility.getNumericData(0, 15);
		 cr.setPgYearpass(yrpg);
	}
	
			 
	@Test 
	public void verifyInvalidInputs() throws IOException
	{
	
	   	cr=new CreateResumePage(driver);
		String fullname= ExcelUtility.getData(1, 0);
		cr.setFullname(fullname);
		 long dob= ExcelUtility.getNumericData(1, 1);
			cr.setDOB(dob);
		cr.GenderClick();
		String email= ExcelUtility.getData(1, 2);
		cr.setMail(email);
		 long mob= ExcelUtility.getNumericData(1, 3);
		cr.setMobile(mob);
		 cr.setBoard();
		 long pr= ExcelUtility.getNumericData(1, 4);
		 cr.setPercent(pr);
		 String sn= ExcelUtility.getData(1, 5);
		 cr.setSchoolname(sn);
		 long yr= ExcelUtility.getNumericData(1, 6);
		 cr.setYear(yr);
		 cr.setHBoard();
		 long per= ExcelUtility.getNumericData(1, 7);
		 cr.setPercentag(per);
		 String scn= ExcelUtility.getData(1, 8);
		 cr.setSchoolnam(scn);
		 long yrr= ExcelUtility.getNumericData(1, 9);
		 cr.setYears(yrr);
		 cr.setDegree();
		 cr.setCourse();
		 long perc= ExcelUtility.getNumericData(1, 10);
		 cr.setPercenta(perc);
		 String clg= ExcelUtility.getData(1, 11);
		 cr.setInstnam(clg);
		 long yrp= ExcelUtility.getNumericData(1, 12);
		 cr.setYearpass(yrp);
		 cr.setPostgraduate();
		 cr.setPgCourse();
		 long percg= ExcelUtility.getNumericData(1, 13);
		 cr.setPgPercentage(percg);
		 String clgn= ExcelUtility.getData(1, 14);
		 cr.setInstinam(clgn);
		 long yrpg= ExcelUtility.getNumericData(1, 15);
		 cr.setPgYearpass(yrpg);
	}
	@Test 
	public void verifyNullValues() throws IOException
	{
	
	   	cr=new CreateResumePage(driver);
		String fullname= ExcelUtility.getData(2, 0);
		cr.setFullname(fullname);
		 long dob= ExcelUtility.getNumericData(2, 1);
			cr.setDOB(dob);
		cr.GenderClick();
		String email= ExcelUtility.getData(2, 2);
		cr.setMail(email);
		 long mob= ExcelUtility.getNumericData(2, 3);
		cr.setMobile(mob);
		 cr.setBoard();
		 long pr= ExcelUtility.getNumericData(2, 4);
		 cr.setPercent(pr);
		 String sn= ExcelUtility.getData(2, 5);
		 cr.setSchoolname(sn);
		 long yr= ExcelUtility.getNumericData(2, 6);
		 cr.setYear(yr);
		 cr.setHBoard();
		 long per= ExcelUtility.getNumericData(2, 7);
		 cr.setPercentag(per);
		 String scn= ExcelUtility.getData(2, 8);
		 cr.setSchoolnam(scn);
		 long yrr= ExcelUtility.getNumericData(2, 9);
		 cr.setYears(yrr);
		 cr.setDegree();
		 cr.setCourse();
		 long perc= ExcelUtility.getNumericData(2, 10);
		 cr.setPercenta(perc);
		 String clg= ExcelUtility.getData(2, 11);
		 cr.setInstnam(clg);
		 long yrp= ExcelUtility.getNumericData(2, 12);
		 cr.setYearpass(yrp);
		 cr.setPostgraduate();
		 cr.setPgCourse();
		 long percg= ExcelUtility.getNumericData(2, 13);
		 cr.setPgPercentage(percg);
		 String clgn= ExcelUtility.getData(2, 14);
		 cr.setInstinam(clgn);
		 long yrpg= ExcelUtility.getNumericData(2, 15);
		 cr.setPgYearpass(yrpg);
	}
}
