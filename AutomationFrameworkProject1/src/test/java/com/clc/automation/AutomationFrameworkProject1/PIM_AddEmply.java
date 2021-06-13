package com.clc.automation.AutomationFrameworkProject1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PIM_AddEmply extends RootPageObject {
	
	@FindBy (id="menu_pim_viewPimModule")
	WebElement  pim;
	
	@FindBy (id="menu_pim_addEmployee")
	WebElement  menu_pim_addEmployee;
	
	@FindBy (name="firstName")
	WebElement  firstName;
	
	@FindBy (name="middleName")
	WebElement  middleName;
	
	@FindBy (name="lastName")
	WebElement  lastName;
	
	@FindBy (name="employeeId")
	WebElement  employee_id;
	
	@FindBy (name="photofile")
	WebElement fileupload;
	
	@FindBy (name="chkLogin")
	WebElement checkbox;
	
	@FindBy (name="user_name")
	WebElement user_name;
	
	@FindBy (name="user_password")
	WebElement user_password;
	
	@FindBy (name="re_password")
	WebElement confirm_password;
	
	@FindBy (name="status")
	WebElement status1;
	
	@FindBy (id="btnSave")
	WebElement save;
	
	public void navigatetopage()
	{
		Actions action =new Actions(driver);
		action.moveToElement(pim).moveToElement(menu_pim_addEmployee).click().build().perform();
	}
	
	public void enterFullNameEmp (String f_name,String m_name,String l_name)
	{
		enterValue(firstName,f_name);
		enterValue(middleName,m_name);
		enterValue(lastName,l_name);
		
	}
	
	public void enterempid(String id)
	{
		enterValue(employee_id,id);	
	}
	public void upoloadFile(String FileUrl) throws InterruptedException, AWTException
	{
		StringSelection selection=new StringSelection(FileUrl);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection,selection);
		fileupload.click();
		
		TimeUnit.SECONDS.sleep(5);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		TimeUnit.MICROSECONDS.sleep(1);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		TimeUnit.SECONDS.sleep(1);
		robot.keyPress(KeyEvent.VK_ENTER);
		TimeUnit.MICROSECONDS.sleep(10);
		robot.keyRelease(KeyEvent.VK_ENTER);
		TimeUnit.SECONDS.sleep(2);
		
	}
	
	public void clickonLoginDetails() 
	{
		clickOnElement(checkbox);
		
	}
	
	public void enterUsernamepwd(String u_name,String pwd,String c_pwd)
	{
		enterValue(user_name,u_name);
		enterValue(user_password,pwd);
		enterValue(confirm_password,c_pwd);
	}

	/*public void selectstatus(String u_status)
	{
		for (WebElement element:status1)
		{
			if(element.getAttribute("value").equals(u_status.toString()))
			{
				element.click();
				break;
			}
		}
	}*/
	
	public void submit() {
		clickOnElement(save);
	}
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
	}
	
	
	
	
}
