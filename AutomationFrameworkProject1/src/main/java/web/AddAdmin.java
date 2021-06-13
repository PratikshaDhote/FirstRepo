package web;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clc.automation.AutomationFrameworkProject1.AppConstant;
import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class AddAdmin extends RootPageObject
{
	
	@FindBy (id="menu_admin_viewAdminModule")
	WebElement admin;
	
	@FindBy(name="btnAdd")
	WebElement add;
	
	@FindBy(id="systemUser")
	List<WebElement> userrole;
	
	@FindBy(id="systemUser")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement usName;
	
	@FindBy(id="systemUser_status")
	List<WebElement> status1;
	
	@FindBy(id="systemUser_password")
	WebElement epassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmpwd;
	
	@FindBy(id="btnSave")
	WebElement save;
	
	@FindBy(id="btnCancel")
	WebElement cancel;
	
	public void click()
	{
		clickOnElement(admin);
		clickOnElement(add);
	}
	/*public void selectUserRole(String u_role)
	{
		for (WebElement element:userrole)
		{
			if(element.getAttribute("value").equals(u_role.toString()))
			{
				element.click();
				break;
			}
		}
		
		
	}*/

	public void enterEmpname1(String empname)
	{
		enterValue(employeeName,empname);
	}
	
	public void enterUserName(String username)
	{
		enterValue(usName,username);
	}
	
	public void selectStatus(AppConstant.status u_Status)
	{
		for(WebElement element:status1)
		{
			if(element.getAttribute("value").equals(u_Status.toString()))
			{
				element.click();
				break;
			}
		}
	}
	public void password(String pwd)
	{
		enterValue(epassword,pwd);
	}
	
	public void confirmPassword(String c_password)
	{
		enterValue(confirmpwd,c_password);
	}
	
	public void submitbtn()
	{
		clickOnElement(save);
	}
	
	public void cancelbtn()
	{
		clickOnElement(cancel);
	}
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	

	
}
