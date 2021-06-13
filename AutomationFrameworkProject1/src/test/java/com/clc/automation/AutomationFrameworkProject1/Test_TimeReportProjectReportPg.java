package com.clc.automation.AutomationFrameworkProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import web.DashboardWCpg;
import web.OrangeHRMLoginPage;
import web.Time_ReportProjectReportPg;

public class Test_TimeReportProjectReportPg {


	@Test
	public void verifytimereportpg(){
		WebDriver driver=Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
		driver.get(AppConstant.ORANGE_HRM_LOGIN_URL);
		
		OrangeHRMLoginPage loginpage=PageFactory.initElements(driver,OrangeHRMLoginPage.class);
		loginpage.enterLoginCredentials("Admin", "admin123");
		loginpage.submitform();
		loginpage.maximizeWindow();
		
		Time_ReportProjectReportPg timereport=PageFactory.initElements(driver,Time_ReportProjectReportPg.class);
		timereport.navigateToProjectReports();
		timereport.selectdate(17);
		timereport.selectdate1(20);
		
}
}