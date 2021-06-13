package com.clc.automation.AutomationFrameworkProject1;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Toolstable {

		@Test
	    public void file() throws Exception
	    {
			WebDriver driver=Browserlaunch.initializeDriver(AppConstant.supportedBrowser.CHROME);
			System.out.println("+++++++++++++++++++++++");
	    driver.get("https://www.toolsqa.com//automation-practice-table//");
	    Thread.sleep(2);
	     driver.manage().window().maximize();
	     System.out.println("Launch site");
	    
	  
	     	     
	     FileInputStream ips= new FileInputStream("D:\\Automation\\AutomationFrameworkProject1\\Toolsqa.xlsx");
	     XSSFWorkbook workbook = new XSSFWorkbook(ips);
	     XSSFSheet sheet = workbook.getSheetAt(0);
	     
	     
	     List<WebElement>  list= driver.findElements(By.xpath("//*[@id='content']/table"));
	     System.out.println(list.size());

	     for(WebElement webelement:list)
	     {
	   	  System.out.println(webelement.getText());
	   	  
	     }
	  String structure_b=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/th")).getText();
	  System.out.println(structure_b);
	    }
			
	    	
}
	  