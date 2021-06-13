package web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class OrangeHRMLoginPage extends RootPageObject{

	@FindBy(name="txtUsername")
	WebElement username;
	
	@FindBy(name="txtPassword")
	WebElement password;

	@FindBy(name="Submit")
	WebElement submitbtn;
			
	@FindBy(id="spanMessage")
	WebElement failMessage;
	
	public void enterLoginCredentials(String uname,String pwd )
	{
		enterValue(username,uname);
		enterValue(password,pwd);
	}
	
	public void submitform()
	{
		clickOnElement(submitbtn);
	}
	
	public void loginfail()
	{
		String actualmsgerror=driver.findElement(By.id("spanMessage")).getText();
		//Assert.assertEquals(actualmsgerror, "Invalidcredentials");
		Assert.assertEquals(actualmsgerror, "Invalidcredentials", "Invalid Credentials");
	}
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com");
	}
	

}
