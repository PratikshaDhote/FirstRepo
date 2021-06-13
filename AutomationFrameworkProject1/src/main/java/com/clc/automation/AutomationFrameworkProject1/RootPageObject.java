package com.clc.automation.AutomationFrameworkProject1;

public abstract class RootPageObject extends Browserlaunch {

	abstract public boolean isPageLoaded();//for validation...An element that triggers page load waits till the 
	//DOM gets loaded before returing control to the driver. For example - if we submit a form by clicking the 
	//Submit button then the next statement 
	//after the submit button click operation will be attemted by webDriver only after the page gets 
	//loaded completely.for eg. @find by 
}
