package com.Edit.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Edit_Resumepage {
	WebDriver driver;

	private WebElement fullname;
	private WebElement dob;
	private WebElement gender;
	private WebElement email;
	private WebElement mob;
	private WebElement Board;
	private WebElement Percentage;
	private WebElement Schoolname;
	private WebElement year;
//----------------------------------------------------------------------------------------------------
	private WebElement addprj;
	private WebElement title;

	private WebElement desc;

	private WebElement addqli;

	private WebElement addcrs;

	private WebElement sletcrs;

	private WebElement addcourse;

	private WebElement addpersentage;

	private WebElement jobexp;

	private WebElement jobtitle;

	private WebElement fromyr;

	private WebElement toyear;

	private WebElement yrskil;

	private WebElement skill;

	private WebElement lang;

	private WebElement langkn;

	private WebElement prlang;

	private WebElement langname;

	private WebElement langper;

	private WebElement yrachi;

	private WebElement achievment;

	private WebElement des;

	private WebElement desyr;
	private WebElement update;
	
	
	public Edit_Resumepage(WebDriver driver)
		
		{
			this.driver=driver;
	 }
	public void setFullname()
	
	{
	fullname=driver.findElement(By.xpath("//input[@id='name']"));
	fullname.sendKeys("heera");
	}
	public void setDOB()
	
	{
	dob=driver.findElement(By.xpath("//input[@id='date']"));
	dob.sendKeys("13-11-1999");
	}
	public void GenderClick()
	
	{
	WebElement male= driver.findElement(By.id("gender"));
//	gender=driver.findElement(By.xpath("//input[@type=\"radio\" and @value='female']"));
    male.click();
	}
	
	public void setMail(String setUser)
	
	{
	email=driver.findElement(By.xpath("//input[@id='email_id']"));
	email.sendKeys("arunnakulan2017@gmail.com");
	}
	
	public void setMob()
	{
	mob=driver.findElement(By.xpath("//input[@id=\"phone\"]"));
	mob.sendKeys("7898765654");
	}
	public void setBoard()
	{
		Select drpBoard= new Select(driver.findElement(By.xpath("//select[@id=\"edu_title\"]")));
		drpBoard.selectByVisibleText("CBSC");
		
	}
	public void setPercentage()
	{
		Percentage=driver.findElement(By.xpath("//input[@id=\"edu_desc\"]"));
		Percentage.sendKeys("90");
		
	}
	public void setSchoolname()
	{
		Schoolname.findElement(By.xpath("//input[@id=\"edu_school\"]"));
		Schoolname.sendKeys("st.thomas ");
	}
	public void setyear()
	{
		year.findElement(By.xpath("//input[@id=\"edu_year\"]"));
		year.sendKeys("2015");
	}
	//----------------------------------------------------------------------------
	public void AddProjectClick()
    {
	   addprj=driver.findElement(By.xpath("//table[@formarrayname=\"projects\"]//button[1]"));

	    addprj.click();
	}


	public void AddTitle(String setValue)


	{
	    title=driver.findElement(By.xpath("//input[@formcontrolname='title']"));

	    title.sendKeys(setValue);
	}

	public void AddDescp(String setValue)


	{

	     desc=driver.findElement(By.xpath("//input[@formcontrolname='desc']"));

	     desc.sendKeys(setValue);


	}


	public void AddQualificationClick()


	{

	addqli=driver.findElement(By.xpath("//*[@formarrayname='qualifications']//th[2]//button[@class='btn btn-primary']"));

	addqli.click();


	}


	public void AddCourseClick()


	{

	addcrs=driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));

	addcrs.click();


	}


	public void SlectCourseClick()


	{

	Select sletcrs=new Select(driver.findElement(By.xpath("//option[@value='Diploma']")));

	sletcrs.selectByVisibleText("Diploma");


	}


	public void AddCourseName(String setValue)


	{

	addcourse=driver.findElement(By.xpath("//input[@formcontrolname='course_name']"));

	addcourse.sendKeys(setValue);

	addcourse.clear();


	}


	public void AddPersentage(String setValue)


	{

	addpersentage=driver.findElement(By.xpath("//input[@formcontrolname='percentage']"));

	addpersentage.sendKeys(setValue);

	addpersentage.clear();


	}


	public void AddJobExperienceClick()


	{

	jobexp=driver.findElement(By.xpath("//*[@formarrayname='experiences']//button[@class='btn btn-primary']"));

	jobexp.click();

	jobexp.clear();


	}

	public void AddJobTitle(String setValue)


	{

	jobtitle=driver.findElement(By.xpath("//input[@formcontrolname='job_title']"));

	jobtitle.sendKeys(setValue);

	jobtitle.clear();

	}


	public void AddFromYear(String setValue)


	{

	fromyr=driver.findElement(By.xpath("//input[@formcontrolname='exp_from']"));

	fromyr.sendKeys(setValue);

	fromyr.clear();

	}


	public void AddToYear(String setValue)


	{

	toyear=driver.findElement(By.xpath("//input[@formcontrolname='exp_to']"));

	toyear.sendKeys(setValue);

	toyear.clear();

	}


	public void AddYourSkilsClick()


	{

	yrskil=driver.findElement(By.xpath("//*[@formarrayname='skills']//button[@class='btn btn-primary']"));

	yrskil.click();

	}


	public void AddYourSkil(String setValue)


	{

	skill=driver.findElement(By.xpath("//input[@formcontrolname='skills']"));

	skill.sendKeys(setValue);

	skill.clear();

	}


	public void AddLanguageClick()


	{

	lang=driver.findElement(By.xpath("//*[@formarrayname='languages']//button[@class='btn btn-primary']"));

	lang.click();

	}


	public void AddLanguageKnown(String setValue)


	{

	langkn=driver.findElement(By.xpath("//input[@formcontrolname='languages']"));

	langkn.sendKeys(setValue);

	langkn.clear();

	}

	public void AddPrgLanguageClick()


	{

	prlang=driver.findElement(By.xpath("//*[@formarrayname='progs']//button[@class='btn btn-primary']"));

	prlang.click();

	}


	public void AddLanguageName(String setValue)


	{

	langname=driver.findElement(By.xpath("//input[@formcontrolname='progs']"));

	langname.sendKeys(setValue);

	langname.clear();

	}


	public void AddLanguagePersentage(String setValue)


	{

	langper=driver.findElement(By.xpath("//input[@formcontrolname='prog_perc']"));

	langper.sendKeys(setValue);

	langper.clear();

	}


	public void AddYourAchievClick()


	{

	yrachi=driver.findElement(By.xpath("//*[@formarrayname='achievements']//button[@class='btn btn-primary']"));

	yrachi.click();

	}

	public void AddYourAchievement(String setValue)


	{

	achievment=driver.findElement(By.xpath("//*[@formarrayname='achievements']//th[@colspan='2']"));

	achievment.sendKeys(setValue);

	achievment.clear();

	}

	public void AddDescribeClick()


	{

	des=driver.findElement(By.xpath("//textarea[@id='yourself']"));

	des.click();

	}

	public void AddDescribeYour(String setValue)


	{

	desyr=driver.findElement(By.xpath("//textarea[@id='yourself']"));

	desyr.sendKeys(setValue);

	}
	
	
	
	public void AddUpdateclick()
	{
		update=driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]"));
		update.click();
		
	}
	
}
