package org.ict.drrpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup {
WebDriver driver ;
private WebElement username,phno,mail,passw,cpassw,reg;
public Signup(WebDriver driver) {
	this.driver=driver;
	
}
public void setUsername(String setUser) {
	username=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='username']"));
	username.sendKeys(setUser);
}
public void setPhno(long setPh) {
	phno=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='phone']"));
	phno.sendKeys(String.valueOf(setPh));
}
public void setMail(String setMails) {
	mail=driver.findElement(By.xpath("//input[@type='text' and @formcontrolname='email_id']"));
	mail.sendKeys(setMails);
}
public void setPass(String setPassw) {
	passw=driver.findElement(By.xpath("//input[@type='password' and@formcontrolname='pass1']"));
	passw.sendKeys(setPassw);
}
public void setCpass(String setCpassw) {
	cpassw=driver.findElement(By.xpath("//input[@type='password' and@formcontrolname='pass2']"));
	cpassw.sendKeys(setCpassw);
}
public void Registerclick() {
reg=driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div/form/button/span"));
reg.click();
}
}
