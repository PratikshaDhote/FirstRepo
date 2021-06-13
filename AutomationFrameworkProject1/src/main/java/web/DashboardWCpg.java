package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class DashboardWCpg extends RootPageObject {

	@FindBy(id="welcome")
	WebElement dashboard;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement dashboard_admin;

	@FindBy(id="menu_admin_UserManagement")
	WebElement dashboard_admin_Usermanagement;
	
	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement dashboard_admin_Usermanagement_user;
	
	@FindBy(id="resultTable")
	WebElement resultTable;
	
	public  void navigatetoelements()
	{
		Actions action =new Actions(driver);
		
		action.moveToElement(dashboard_admin).moveToElement(dashboard_admin_Usermanagement).moveToElement(dashboard_admin_Usermanagement_user).click().build().perform();
		
	}
	
	public void selectDyanmicTableUsers(String empName)
	{
		List <WebElement> rows=resultTable.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		
		for(WebElement singleRow : rows){
			List<WebElement> colns = singleRow.findElements(By.tagName("td"));
			if(colns.get(3).getText().equals(empName)){
				colns.get(0).findElement(By.tagName("input")).click();
			}}
	}

	
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		try {
		return dashboard.isDisplayed();
	}
		catch(Exception e)
		{
			return false;
		}
}
}