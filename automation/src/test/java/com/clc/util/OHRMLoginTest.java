package com.clc.util;

import org.testng.annotations.Test;

public class OHRMLoginTest {


	@Test
	public void verifyLogin(){
		BrowserLaunch.getBrowserInstance(AppConstants.SupportedBrowsers.CHROME, AppConstants.ORANGE_HRM_LOGIN_URL).clickOnLogin("Admin","admin123");
		
	}
	
	
	@Test(enabled=false)
	public void verifyLoginCredentionals(){
		BrowserLaunch.getBrowserInstance(AppConstants.SupportedBrowsers.CHROME, AppConstants.ORANGE_HRM_LOGIN_URL).clickOnLogin("Admin","admin123");;
	}
	

}
