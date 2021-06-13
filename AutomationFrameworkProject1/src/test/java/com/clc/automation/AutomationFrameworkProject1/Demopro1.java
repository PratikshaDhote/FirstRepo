package com.clc.automation.AutomationFrameworkProject1;

import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Demopro1 {
	public static void main(String[] args) throws Exception {
	Screen screen =new Screen();
	
	Pattern p1= new Pattern("D:\\Java pro\\Pattern\\Capture 1.PNG");
	Pattern p2= new Pattern("D:\\Java pro\\Pattern\\Capture 2.PNG");
	Pattern p3= new Pattern("D:\\Java pro\\Pattern\\Capture 3.PNG");
	Pattern p4= new Pattern("D:\\Java pro\\Pattern\\Capture 4.PNG");
	Pattern p5= new Pattern("D:\\Java pro\\Pattern\\Capture 5.PNG");
	
	screen.wait(p1,5);
	screen.click(p1);
	
	screen.wait(p2,5);
	screen.type("download flower images");
	screen.type(Key.ENTER);
	
	screen.wait(p3,5);
	screen.click(p3);
	
	screen.wait(p4,5);
	screen.click(p4);
	
	screen.wait(p5,5);
	screen.click(p5);
}
}