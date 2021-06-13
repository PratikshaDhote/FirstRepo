 package com.clc.automation.AutomationFrameworkProject1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.clc.automation.AutomationFrameworkProject1.AppConstant.Scroll;
import com.clc.automation.AutomationFrameworkProject1.AppConstant.supportedBrowser;

import web.LoginPageInstance;

public abstract class Browserlaunch {

	public static  WebDriver driver=null;
	
	public static LoginPageInstance getBrowserInstance(supportedBrowser browser,String appUrl){
		driver.get(appUrl);
initializeDriver(browser);
driver.get(appUrl);
return PageFactory.initElements(driver,LoginPageInstance.class);
}
	
	static public WebDriver initializeDriver(supportedBrowser browser){
		if (driver==null){
			switch (browser) {
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver","D:\\Java pro\\Selenium\\Firefox 66 webdriver\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			case CHROME:
				System.setProperty("webdriver.chrome.driver","D:\\Java pro\\Selenium\\Chrome webdriver 74\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			default:
				Assert.fail("Invalid Browser type..no cannot start test execution...!");
				}
		}
		return driver;
	}
	
	
	public void closeBrowserWindow(){
			if(driver!=null){
				driver.close();
			}
	}
	
	public void closeAllBrowserWindows(){
		if(driver!=null){
			driver.quit();
		}
	}
	
	
	public void minimizeWindow() throws AWTException, InterruptedException{
		if(driver!=null){
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_N);
			TimeUnit.MICROSECONDS.sleep(10);
			robot.keyRelease(KeyEvent.VK_N);
		 	robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_ALT);
		}
	}
	
	
	public void maximizeWindow(){
		if(driver!=null)
			driver.manage().window().maximize();
	}
	
	public void scrollPage(Scroll type){
		if(driver!=null){
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				if(type.equals(Scroll.UP)){
					executor.executeScript("window.scrollBy(0,-250)", "");
				}else if(type.equals(Scroll.DOWN)){
					executor.executeScript("window.scrollBy(0,250)", "");
				}	
	}
	}
	
	public void takeScreenShot(String testCaseName) throws IOException{
		if(driver!=null){
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile=new File(AppConstant.CAPTURED_ERRORS_SCREENSHOTS+testCaseName+".png");
            FileUtils.copyFile(SrcFile, DestFile);
		}
	}

	
	public void clickOnElement(WebElement element){
		if(element!=null){
			try{
				element.click();
			}catch(NoSuchElementException e){
			}catch (Exception e) {
			}
		}
	}
	
	public void enterValue(WebElement element,String text){
		if(element!=null){
			try{
				element.clear();
				element.sendKeys(text);
			}catch(NoSuchElementException e){
			}catch (Exception e) {
			}
		}
	}
	
	public void selectByText(WebElement drowdown,boolean isMultiple,String ...texts){
		if(driver!=null){
			Select select = new Select(drowdown);	
			if (isMultiple){
						for(String txt : texts)
							select.selectByVisibleText(txt);
				}else{
					select.selectByVisibleText(texts[0]);
				}

		}
				}
	
	
	
}
