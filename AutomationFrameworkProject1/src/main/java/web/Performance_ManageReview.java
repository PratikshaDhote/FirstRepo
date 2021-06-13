package web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.clc.automation.AutomationFrameworkProject1.AppConstant;
import com.clc.automation.AutomationFrameworkProject1.RootPageObject;

public class Performance_ManageReview extends RootPageObject {

	@FindBy (id="menu__Performance")
	WebElement performance;
	
	@FindBy(id="menu_performance_ManageReviews")
	WebElement performance_ManageReviews;
	
	@FindBy(id="menu_performance_searchPerformancReview")
	WebElement searchPerformancReview;
	
	@FindBy(id="performanceReview360SearchForm_employeeName")
	WebElement empname;
	
	@FindBy(id="performanceReview360SearchForm_jobTitleCode")
	WebElement jobtitle;
	
	@FindBy(id="performanceReview360SearchForm_status")
	WebElement status;
	
	@FindBy(id="performanceReview360SearchForm_reviwerName")
	WebElement review;
	
	@FindBy(name="btnSearch")
	WebElement search;
	
	public void navigatetoelement()
	{
		Actions action=new Actions(driver);
		action.moveToElement(performance).moveToElement(performance_ManageReviews).moveToElement(searchPerformancReview).click().build().perform();
		
	}
	
	public void enteremplyoee(String empnm)
	{
		enterValue(this.empname, empnm);
		
	}
	
	public void jobtit()
	{
		Select select=new Select(jobtitle);
		select.selectByVisibleText("HR Manager");
	}
	
	public void selectstatus()
	{
		
		Select select=new Select(status);
		select.selectByVisibleText("Approved");
	}
		/*for (WebElement element : status) {
			if(element.getAttribute("value").equals(statusselection.toString()))
			{
				element.click();
				break;
			}*/
	public void selectdatefrom(int date)
	{
		String fromdate="//*[@id=\"performanceReview360SearchForm\"]/fieldset/ol/li[4]/img";
		driver.findElement(By.xpath(fromdate));
	List <WebElement> dates=	driver.findElement(By.className("ui-datepicker-trigger")).findElements(By.tagName("img"));
	for (WebElement element : dates) {
		System.out.println(element.getText());
		if(Integer.parseInt(element.getText())==date)
			
			
			
			
			
			
			
			
			
			
		{
			element.click();
			break;
			
		}
	}
		/*JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById('fromDate').style.display='block';");
		Select select = new Select(driver.findElement(By.name("time[project_date_range][from]")));
		select.selectByVisibleText(date);
		//Thread.sleep(3000);
*/	}
	public void selectdateto(String date1)
	{
		String todate="//*[@id=\"performanceReview360SearchForm\"]/fieldset/ol/li[5]/img";
		driver.findElement(By.xpath(todate));
		List<WebElement> datesto= driver.findElement(By.className("ui-datepicker-trigger")).findElements(By.tagName("img"));
		for (WebElement elements : datesto) {
			System.out.println(elements.getText());
			if((elements.getText())==date1)
			{
				elements.click();
				break;
			}
		}
	}
		public void reviewer(String reviews)
		{
			
			enterValue(this.review,reviews);
		}
	
	@Override
	public boolean isPageLoaded() {
		// TODO Auto-generated method stub
		try {
			return performance.isDisplayed();
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	
	
}
