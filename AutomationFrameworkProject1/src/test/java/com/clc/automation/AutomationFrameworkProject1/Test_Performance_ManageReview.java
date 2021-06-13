package com.clc.automation.AutomationFrameworkProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.AppCacheStatus;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.clc.automation.AutomationFrameworkProject1.AppConstant.statusperformance;

import web.OrangeHRMLoginPage;
import web.Performance_ManageReview;

public class Test_Performance_ManageReview {
	
	@Test
	public void verifyperformance()
	{
		WebDriver driver=Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
		driver.get(AppConstant.ORANGE_HRM_LOGIN_URL);
		
		OrangeHRMLoginPage loginpage=PageFactory.initElements(driver, OrangeHRMLoginPage.class);
		loginpage.enterLoginCredentials("Admin", "admin123");
		loginpage.submitform();
		loginpage.maximizeWindow();
		
		Performance_ManageReview performancepg =PageFactory.initElements(driver, Performance_ManageReview.class);
		performancepg.navigatetoelement();
		performancepg.enteremplyoee("pratiksha");
		performancepg.jobtit();
		performancepg.selectstatus();
		//performancepg.selectdatefrom(24/07/2019);
		performancepg.selectdateto("25 07 2019");
		performancepg.reviewer("best emplyoee");
		
		
		
	}

}
