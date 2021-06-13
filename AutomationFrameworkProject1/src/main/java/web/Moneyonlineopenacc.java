package web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class Moneyonlineopenacc extends RootPageObject{

	@FindBy(className="btn btn-primary")
	WebElement openacc;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password2")
	WebElement retypepwd;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="password2")
	WebElement retypepwd;
	
	
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

}
