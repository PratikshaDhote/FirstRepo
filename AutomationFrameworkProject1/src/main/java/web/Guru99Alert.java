package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;

import com.clc.automation.AutomationFrameworkProject1.AppConstant;
import com.clc.automation.AutomationFrameworkProject1.AppConstant.userchoice;
import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class Guru99Alert extends RootPageObject{

	
	@FindBy(name="cusid")
	WebElement cust_id;

	@FindBy(name="submit")
	WebElement submit;
	
	@FindBy(name="res")
	WebElement reset;
	
	public void launchwebsiteguru99()
	{
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		submit.click();
	}
	
	public void deleteConfirmationAlert(AppConstant.userchoice choice)
	{
		Alert alert=driver.switchTo().alert();
		
		if(userchoice.ok.equals(choice))
		{
			alert.accept();
		}
		else
		{
			alert.dismiss();
	}
		handleSimpleAlert();
	}
	
	public void handleSimpleAlert()
	{
		try
		{
			TimeUnit.SECONDS.sleep(4);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Alert alert=driver.switchTo().alert();
	}
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

}
