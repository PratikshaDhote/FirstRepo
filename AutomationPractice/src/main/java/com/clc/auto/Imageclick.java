package com.clc.auto;


public class Imageclick {
	
	
	public void test() {
	System.setProperty("webdriver.chrome.driver","D:\\Java pro\\Selenium\\Chrome webdriver 74\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	// Maximize the window
	driver.manage().window().maximize();
}
}