package com.clc.automation.AutomationFrameworkProject1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.clc.automation.AutomationFrameworkProject1.AppConstant.supportedBrowser;

public class TestCloutchSite {

	@Test
	 public void fetchclutchinfo()
	 {
		WebDriver driver=Browserlaunch.initializeDriver(supportedBrowser.CHROME);
		driver.get("https://clutch.co/agencies?page=1");
		WebElement allcompanies =driver.findElement(By.className("directory-list"));
		List<WebElement> listofcompanies=allcompanies.findElements(By.className("provider-row"));
		System.out.println(listofcompanies.size());
		String parentWindow=driver.getWindowHandle(); //id of parent window--1
		//int count=0;
		for(WebElement companies:listofcompanies)
		{
			String companyName=companies.findElement(By.className("company-name")).getText();
			String content=companies.findElement(By.className("blockquote-in-module")).getText();
			String companyUrl = companies.findElement(By.className("row")).findElement(By.className("provider-link-details")).findElement(By.className("website-link")).findElement(By.tagName("a")).getAttribute("href");
			companies.findElement(By.className("row")).findElement(By.className("provider-link-details")).findElement(By.className("website-link")).findElement(By.tagName("a")).click();
			
			Set<String> allWindowIds  = driver.getWindowHandles();
			
			for (String id : allWindowIds) {
				if(id.equals(allWindowIds))
				{
					if(id.equals(parentWindow))
					{
						continue;
					}
				
				else
				{
					driver.switchTo().window(id);
					System.out.println("Current URL is"+driver.getCurrentUrl());
					
				}
			}
				System.out.println(companyName);
				System.out.println(content);
				System.out.println(companyUrl);
				System.out.println("------------------------------------------------------");
		}
	 }
}
}