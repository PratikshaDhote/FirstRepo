package com.clc.web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.clc.util.RootPageObject;

public class LoginPageInstance extends RootPageObject {

	@FindBy(id="txtUsername")
	private WebElement userName;					// driver.findelement(By.id("txtUsername"))
	
	@FindBy(id="txtPassword")
	private WebElement password;	
	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;	
	
	@FindBy(id="spanMessage")
	WebElement errorMessage;	
	
	public boolean isPageLoaded(){
		try{
			return loginBtn.isDisplayed();
		}catch(Exception e){
			return false;
		}
	}
	
	
	private void enterUserName(String unm){
		enterValue(this.userName,unm);
	}
	
	private void enterUserPassword(String pwd){
		enterValue(this.password,pwd);
	}
	
	public void clickOnLogin(String username,String password){
		this.enterUserName(username);
		this.enterUserPassword(password);
		clickOnElement(this.loginBtn);
	}
	
}
