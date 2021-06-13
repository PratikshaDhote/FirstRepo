package web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.clc.automation.AutomationFrameworkProject1.AppConstant;
import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class ToolsQAPracticeForm extends RootPageObject {
	@FindBy(name = "firstname")
	WebElement firstName;

	@FindBy(name = "lastname")
	WebElement lastName;

	@FindBy(name = "sex")
	List<WebElement> genderType;

	@FindBy(name = "exp")
	List<WebElement> yearOfExp;

	@FindBy(id = "datepicker")
	WebElement date;

	@FindBy(name = "profession")
	List<WebElement> profession;

	@FindBy(id = "photo")
	WebElement photoUpload;

	@FindBy(name = "tool")
	List<WebElement> automationTool;

	@FindBy(id = "continents")
	WebElement continent;

	@FindBy(id = "selenium_commands")
	WebElement seleniumCmds;

	
	
	
	public void enterUserDetails(String fnm,String lnm){
		enterValue(firstName, fnm);
		enterValue(lastName, lnm);
	}
	
	public void selectGender(AppConstant.Genders p_gender){
			for (WebElement element: genderType) {
				if(element.getAttribute("value").equals(p_gender.toString())){
					element.click();
					break;
				}
			}
	}
	
	public void selectYearOfExp(int p_yearOfExp){
		for (WebElement element: yearOfExp) {
			if(element.getAttribute("value").equals(p_yearOfExp+"")){
				element.click();
				break;
			}
		}
}

	
	public void enterDate(String date){
		enterValue(this.date, date);
	}
	
	public void selectAutomationTools(AppConstant.tools ...atools){
		for(AppConstant.tools tool : atools){
					for(WebElement element : automationTool){
						if(element.getAttribute("value").equals(tool.getValue())){
							element.click();
							break;
						}
					}
		}
	}

	public void selectContinent(String continen){
		Select select = new Select(continent);
		select.selectByVisibleText(continen);
	}

	public void selectCommands(String ...cmds){
		Select select = new Select(seleniumCmds);
		for(String cmd: cmds){
				select.selectByVisibleText(cmd);
		}
		
	}
	
public void uploadPhoto(String fileUrl) throws InterruptedException, AWTException{
		StringSelection selection = new StringSelection(fileUrl);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		
		photoUpload.click();
		
		TimeUnit.SECONDS.sleep(5);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		TimeUnit.MICROSECONDS.sleep(10);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		TimeUnit.SECONDS.sleep(1);
		robot.keyPress(KeyEvent.VK_ENTER);
		TimeUnit.MICROSECONDS.sleep(10);
		robot.keyRelease(KeyEvent.VK_ENTER);
		TimeUnit.SECONDS.sleep(2);
	}
	
	
	
	public void selectAutomationSkils(AppConstant.SkillSet ...skils){
		for(AppConstant.SkillSet skill : skils){
					for(WebElement element : profession){
						if(element.getAttribute("value").equals(skill.getValue())){
							element.click();
							break;
						}
					}
		}
	}
	
	@Override
	public boolean isPageLoaded() {
		return driver.getCurrentUrl().equals("https://www.toolsqa.com/automation-practice-form/");
	}
	
}

