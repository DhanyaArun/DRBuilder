package org.ict.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class CreateResumePage {
	WebDriver driver;

	private WebElement fullname;
	private WebElement dob;
	private WebElement gender;
	private WebElement email;
	private WebElement mob;
	private WebElement pr;
	private WebElement sn;
	private WebElement yr;
	private WebElement per;
	private WebElement scn;
	private WebElement yrr;
	private WebElement perc;
	private WebElement clg;
	private WebElement yrp;
	private WebElement percg;
	private WebElement clgn;
	private WebElement yrpg;
	
public CreateResumePage(WebDriver driver)
	
	{
		this.driver=driver;
 }

public void setFullname(String setUser)

{
fullname=driver.findElement(By.id("name"));
fullname.sendKeys(setUser);
}
public void setDOB(long setUser) {
dob=driver.findElement(By.id("date"));	
dob.sendKeys(String.valueOf(setUser));
}

public void GenderClick()

{
gender=driver.findElement(By.xpath("//input[@type=\"radio\" and @value='male']"));
gender.click();
}

public void setMail(String setUser)

{
email=driver.findElement(By.id("email_id"));
email.sendKeys(setUser);
}

public void setMobile(long setUser)
{
mob=driver.findElement(By.id("phone"));
mob.sendKeys(String.valueOf(setUser));
}

public void setBoard()
{
	Select drpBoard= new Select(driver.findElement(By.name("edu_title")));
	drpBoard.selectByVisibleText("CBSC");
	}

public void setPercent(long setUser)

{
pr=driver.findElement(By.id("edu_desc"));
pr.sendKeys(String.valueOf(setUser));
}

public void setSchoolname(String setUser)

{
sn=driver.findElement(By.id("edu_school"));
sn.sendKeys(setUser);
}

public void setYear(long setUser)

{
yr=driver.findElement(By.name("edu_year"));
yr.sendKeys(String.valueOf(setUser));
}

public void setHBoard()
{
	Select drpHBoard= new Select(driver.findElement(By.xpath("//p[@formgroupname='higherschools']/select[@formcontrolname='edu_title']")));
	drpHBoard.selectByVisibleText("CBSC");
	}


public void setPercentag(long setUser)

{
per=driver.findElement(By.xpath("//p[@formgroupname='higherschools']/input[@placeholder='Percentage Scored']"));
per.sendKeys(String.valueOf(setUser));
}
public void setSchoolnam(String setUser)

{
scn=driver.findElement(By.xpath("//p[@formgroupname='higherschools']/input[@formcontrolname='edu_school']"));
scn.sendKeys(setUser);
}
public void setYears(long setUser)

{
yrr=driver.findElement(By.xpath("//p[@formgroupname='higherschools']/input[@formcontrolname='edu_year']"));
yrr.sendKeys(String.valueOf(setUser));
}

public void setDegree()
{
	Select drpDegree= new Select(driver.findElement(By.xpath("//p[@formgroupname='graduations']/select[@formcontrolname='edu_title']")));
	drpDegree.selectByVisibleText("BTECH");
	}
public void setCourse()
{
	Select drpCourse= new Select(driver.findElement(By.xpath("//p[@formgroupname='graduations']/select[@formcontrolname='edu_stream']")));
	drpCourse.selectByVisibleText("IT/CS");
	}

public void setPercenta(long setUser)

{
perc=driver.findElement(By.xpath("//p[@formgroupname='graduations']/input[@placeholder='Percentage Scored']"));
perc.sendKeys(String.valueOf(setUser));
}
public void setInstnam(String setUser)

{
clg=driver.findElement(By.xpath("//p[@formgroupname='graduations']/input[@formcontrolname='edu_inst']"));
clg.sendKeys(setUser);
}

public void setYearpass(long setUser)

{
yrp=driver.findElement(By.xpath("//p[@formgroupname='graduations']/input[@formcontrolname='edu_year']"));
yrp.sendKeys(String.valueOf(setUser));
}
public void setPostgraduate()
{
	Select drpPostgraduate= new Select(driver.findElement(By.xpath("//p[@formgroupname='posts']/select[@formcontrolname='edu_title']")));
	drpPostgraduate.selectByVisibleText("MTECH");
	}
public void setPgCourse()
{
	Select drpPgCourse= new Select(driver.findElement(By.xpath("//p[@formgroupname='posts']/select[@formcontrolname='edu_stream']")));
	drpPgCourse.selectByVisibleText("IT/CS");
	}


public void setPgPercentage(long setUser)

{
percg=driver.findElement(By.xpath("//p[@formgroupname='posts']/input[@placeholder='Percentage Scored']"));
percg.sendKeys(String.valueOf(setUser));
}
public void setInstinam(String setUser)

{
clgn=driver.findElement(By.xpath("//p[@formgroupname='posts']/input[@formcontrolname='edu_inst']"));
clgn.sendKeys(setUser);
}
public void setPgYearpass(long setUser)

{
yrpg=driver.findElement(By.xpath("//p[@formgroupname='posts']/input[@formcontrolname='edu_year']"));
yrpg.sendKeys(String.valueOf(setUser));
}

}











