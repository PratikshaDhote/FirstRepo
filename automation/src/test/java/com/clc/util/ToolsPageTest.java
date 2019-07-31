package com.clc.util;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.clc.util.AppConstants.SkillSet;
import com.clc.util.AppConstants.tools;
import com.clc.web.pages.ToolsQAPracticeForm;

public class ToolsPageTest {

	
	@Test
	public void verifyPracticeForm() throws InterruptedException, AWTException{
		WebDriver driver = BrowserLaunch.initializeDriver(AppConstants.SupportedBrowsers.CHROME);
		driver.get(AppConstants.TOOLS_QA_PRACTICE_FORM);
		ToolsQAPracticeForm practiceForm = PageFactory.initElements(driver,ToolsQAPracticeForm.class);
		practiceForm.enterUserDetails("Yogesh","Chame");
		practiceForm.selectGender(AppConstants.Genders.Male);
		practiceForm.selectYearOfExp(7);
		practiceForm.enterDate("12/04/2019");
		practiceForm.uploadPhoto("C:\\Users\\Yogesh\\Desktop\\birdD.jpg");
		practiceForm.selectAutomationTools(tools.qtp,tools.selenium_webdriver);
		practiceForm.selectAutomationSkils(SkillSet.automation,SkillSet.manual);
		practiceForm.selectContinent("Australia");
		practiceForm.selectCommands("Navigation Commands","Wait Commands","Switch Commands");
	}
	
}
