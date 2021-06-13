package com.clc.automation.AutomationFrameworkProject1;

public class AppConstant {

	String CHROME_DRIVER_PATH="D:\\Java pro\\Selenium\\Chrome webdriver 74\\chromedriver.exe";
	String FIREFOX_DRIVER_PATH="D:\\Java pro\\Selenium\\Firefox 66 webdriver\\geckodriver.exe";
	
	String CHROME_DRIVER_PROPERTY="webdriver.chrome.driver";
	String FIREFOX_DRIVER_PROPERTY="webdriver.gecko.driver";
	
	public static final String CAPTURED_ERRORS_SCREENSHOTS = "C:\\Users\\Admin\\Downloads";
	
	public static final String ORANGE_HRM_LOGIN_URL="https://opensource-demo.orangehrmlive.com/";
	//we called is singleton variable as it is declared as public static final
    public static final  String TOOLS_QA_PRACTICE_FORM = "https://www.toolsqa.com/automation-practice-form/";
    public static final  String MoneyOnlineInvestment = "https://moneyonlineinvestment.com/";
	public enum supportedBrowser

	{
		CHROME,
		FIREFOX;
	}
	public enum Scroll{
		UP,
		DOWN
	}
	
	public enum tools{
		qtp("QTP"),
		selenium_ide("Selenium IDE"),
		selenium_webdriver("Selenium Webdriver");

		String value;
		tools(String v){
			this.value=v;
		}
		
		public String getValue(){
			return value;
		}
	}
	public enum SkillSet{
		manual("Manual Tester"), //Manual manual = new Manual("Manual Tester")
		automation("Automation Tester");
		
		String value;
		SkillSet(String v){
			this.value=v;
		}
		
		public String getValue(){
			return value;
		}
		
		
	}
	
	public enum Genders{
		Male,
		Female
	}
	
	
	
	public enum Usersrole
	{
		ESS,
		Admin;
	}
	public enum status
	{
		Enabled,
		Disabled;
	}

	public enum userchoice
	{
		ok,
		cancel;
	}
	
	public enum statusperformance
	{
		zero,one,
		two,three,four;/*All,
		Inactive,
		Activated,
		Approved,
		Inprogress;*/
	}
}

