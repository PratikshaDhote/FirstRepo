package com.clc.automation.AutomationFrameworkProject1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.clc.automation.AutomationFrameworkProject1.AppConstant.supportedBrowser;

public class ZoplaSearchCity {

	@Test
	public void searchzopla()
	{
		WebDriver driver=Browserlaunch.initializeDriver(supportedBrowser.CHROME);
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-input-location")).sendKeys("Liverpool Street, London");
		driver.findElement(By.id("search-submit")).click();
		
		WebElement allhouses=(WebElement) driver.findElement(By.tagName("ul"));
		List<WebElement> listofhouses =allhouses.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
		System.out.println("Total companies are:"+listofhouses.size());
		
		for (WebElement listofitems : listofhouses) {
			System.out.println("price"+"\t"+listofitems.getText());
			
			String content=listofitems.findElement(By.tagName("p")).getText();
			System.out.println("Description about houses"+"\t"+content);
			}
			
		}
		
	}

