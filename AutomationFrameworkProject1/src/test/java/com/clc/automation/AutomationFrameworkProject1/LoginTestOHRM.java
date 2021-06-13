package com.clc.automation.AutomationFrameworkProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import web.OrangeHRMLoginPage;

public class LoginTestOHRM {

	
	@Test
	
	public void verifypage()
	{
		WebDriver driver=Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
		driver.get(AppConstant.ORANGE_HRM_LOGIN_URL);
		OrangeHRMLoginPage loginpage=PageFactory.initElements(driver,OrangeHRMLoginPage.class);
		
		loginpage.enterLoginCredentials("Admin", "admin123");
		loginpage.submitform();
		//loginpage.loginfail();
		
	}
}
