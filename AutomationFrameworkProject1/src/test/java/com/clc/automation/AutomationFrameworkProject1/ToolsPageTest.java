package com.clc.automation.AutomationFrameworkProject1;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.clc.automation.AutomationFrameworkProject1.AppConstant.SkillSet;
import com.clc.automation.AutomationFrameworkProject1.AppConstant.tools;

import web.ToolsQAPracticeForm;

public class ToolsPageTest {

	@Test
	public void verifyPracticeForm() throws InterruptedException, AWTException{
		WebDriver driver = Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
		driver.get(AppConstant.TOOLS_QA_PRACTICE_FORM);
		ToolsQAPracticeForm practiceForm = PageFactory.initElements(driver,ToolsQAPracticeForm.class);
		practiceForm.enterUserDetails("Pratiksha","Dhote");
		practiceForm.selectGender(AppConstant.Genders.Female);
		practiceForm.selectYearOfExp(7);
		practiceForm.enterDate("14/04/2019");
		practiceForm.uploadPhoto("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		practiceForm.selectAutomationTools(tools.qtp,tools.selenium_webdriver);
		practiceForm.selectAutomationSkils(SkillSet.automation,SkillSet.manual);
		practiceForm.selectContinent("Australia");
		practiceForm.selectCommands("Navigation Commands","Wait Commands","Switch Commands");
	}
}
