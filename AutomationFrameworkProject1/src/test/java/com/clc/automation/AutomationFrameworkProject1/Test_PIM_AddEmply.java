package com.clc.automation.AutomationFrameworkProject1;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import web.OrangeHRMLoginPage;


public class Test_PIM_AddEmply {

	@Test
	 void verifythispg() throws InterruptedException, AWTException 
	
	{
		WebDriver driver=Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
		driver.get(AppConstant.ORANGE_HRM_LOGIN_URL);
		
		OrangeHRMLoginPage loginpage=PageFactory.initElements(driver,OrangeHRMLoginPage.class);
		loginpage.enterLoginCredentials("Admin", "admin123");
		loginpage.submitform();
		loginpage.maximizeWindow();
		
		PIM_AddEmply pim=PageFactory.initElements(driver,PIM_AddEmply.class );
		
		pim.navigatetopage();
		pim.enterFullNameEmp("Pratiksha", "Pramod", "Dhote");
		pim.enterempid("101");
		pim.upoloadFile("C:\\Users\\Admin\\Downloads\\ToolsQAPracticeForm.java");
		pim.clickonLoginDetails();
		pim.enterUsernamepwd("Pratiksha", "abcd", "abcd");
		pim.submit();
		
	}
}
