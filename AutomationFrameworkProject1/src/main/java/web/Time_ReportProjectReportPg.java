package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class Time_ReportProjectReportPg extends RootPageObject {

	@FindBy(id="menu_time_viewTimeModule")
	WebElement timeMenu;
	
	@FindBy(id="menu_time_Reports")
	WebElement time_reports;
	
	@FindBy(id="menu_time_displayProjectReportCriteria")
	WebElement time_reports_projectreports;
	
	
	public void navigateToProjectReports(){
		Actions action  =new Actions(driver);
		action.moveToElement(timeMenu).moveToElement(time_reports).moveToElement(time_reports_projectreports).click().build().perform();
	}
	
	public void selectdate(int date)
	{
		String currentdate="//*[@id=\"reportForm\"]/fieldset/ol/li[2]/img[1]";
		navigateToProjectReports();
		driver.findElement(By.xpath(currentdate)).click();
	List<WebElement> listofElements	=driver.findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("a"));
		for(WebElement element : listofElements){
			System.out.println(element.getText());
			if(Integer.parseInt(element.getText())==date){
				element.click();
				break;
	}
		}
		}
	
	public void selectdate1(int date1)
	{
		String currentdate1="//*[@id=\"reportForm\"]/fieldset/ol/li[2]/img[2]";
		navigateToProjectReports();
		driver.findElement(By.xpath(currentdate1)).click();
	List<WebElement> listofElements	=driver.findElement(By.className("ui-datepicker-calendar")).findElements(By.tagName("a"));
		for(WebElement element : listofElements){
			System.out.println(element.getText());
			if(Integer.parseInt(element.getText())==date1){
				element.click();
				break;
	}
		}
		}
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		try {
			return timeMenu.isDisplayed();
		}
		catch(Exception e)
		{
		return false;
	}

	
}
}