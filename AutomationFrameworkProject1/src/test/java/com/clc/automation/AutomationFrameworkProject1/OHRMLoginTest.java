package com.clc.automation.AutomationFrameworkProject1;

import org.testng.annotations.Test;

public class OHRMLoginTest {
	@Test
	public void verifyLogin(){
		Browserlaunch.getBrowserInstance(AppConstant.supportedBrowser.CHROME, AppConstant.ORANGE_HRM_LOGIN_URL).clickOnLogin("Admin","admin123");
		
	}
	
	
	@Test(enabled=false)
	public void verifyLoginCredentionals(){
		Browserlaunch.getBrowserInstance(AppConstant.supportedBrowser.CHROME, AppConstant.ORANGE_HRM_LOGIN_URL).clickOnLogin("Admin","admin123");
	}
	

}
