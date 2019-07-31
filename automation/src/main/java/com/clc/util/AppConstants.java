package com.clc.util;

public interface AppConstants {
	String CHROME_DRIVER_PATH= "C:\\Users\\Yogesh\\Downloads\\selenium_drivers\\chromedriver\\chromedriver.exe";
	String  GECKO_DRIVER_PATH= "C:\\Users\\Yogesh\\Downloads\\selenium_drivers\\geckdriver\\geckodriver.exe";
	String GECKO_DRIVER_PROPERTY ="webdriver.gecko.driver";
	String CHROME_DRIVER_PROPERTY ="webdriver.chrome.driver";
	String CAPTURED_ERRORS_SCREENSHOTS = "C:\\Users\\Yogesh\\Downloads\\selenium_drivers\\errors\\";
	
	String ORANGE_HRM_LOGIN_URL="https://opensource-demo.orangehrmlive.com/";
	String TOOLS_QA_PRACTICE_FORM = "https://www.toolsqa.com/automation-practice-form/";
	public enum SupportedBrowsers{
		FIREFOX,  // Firefox FIREFOX = new Firefox()
		CHROME
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
	
	
	public enum Scroll{
		UP,
		DOWN
	}
	
}
