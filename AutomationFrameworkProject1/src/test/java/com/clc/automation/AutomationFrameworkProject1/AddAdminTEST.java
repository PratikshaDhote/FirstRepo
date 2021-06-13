package com.clc.automation.AutomationFrameworkProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import web.AddAdmin;
import web.OrangeHRMLoginPage;

public class AddAdminTEST {

	@Test
 public void verifyAddAdmintest() throws InterruptedException
	{
	WebDriver driver=Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
	driver.get(AppConstant.ORANGE_HRM_LOGIN_URL);
	
	OrangeHRMLoginPage loginpage=PageFactory.initElements(driver,OrangeHRMLoginPage.class);
	loginpage.enterLoginCredentials("Admin", "admin123");
	loginpage.submitform();
	/*loginpage.loginfail();*/
	
	AddAdmin addadmin=PageFactory.initElements(driver,AddAdmin.class);
	addadmin.click();
	Thread.sleep(1000);
	//addadmin.selectUserRole(AppConstant.Usersrole.Admin);
	addadmin.enterEmpname1("Pratiksha");
	addadmin.enterUserName("PDhote");
	addadmin.password("abcd");
	addadmin.confirmPassword("abcd");
	addadmin.submitbtn();
	addadmin.cancelbtn();
	
	
	
	
}
}