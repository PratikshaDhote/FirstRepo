package com.clc.automation.AutomationFrameworkProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.clc.automation.AutomationFrameworkProject1.AppConstant.supportedBrowser;
import com.clc.automation.AutomationFrameworkProject1.AppConstant.userchoice;

import web.Guru99Alert;

public class TestGuru99Alert {
	@Test
	public void alertHandling() {
		WebDriver driver=Browserlaunch.initializeDriver(supportedBrowser.CHROME);
		Guru99Alert guru99=PageFactory.initElements(driver, Guru99Alert.class);
		guru99.launchwebsiteguru99();
		guru99.deleteConfirmationAlert(userchoice.ok);
	}

}
