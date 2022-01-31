package com.TaaS.qa.utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

public class MousAction
{
	

	private  static WebDriver driveConstructor;

	private  MousAction(WebDriver Driver)
	{
		setDriveConstructor(Driver);
	}

	public static WebDriver getDriveConstructor() 
	{
		return driveConstructor;
	}

	public static void setDriveConstructor(WebDriver driveConstructor) 
	{
		MousAction.driveConstructor = driveConstructor;
	}

	public  void getMmouseAction()
	{
	//Action action = new Action(driveConstructor);
	
		
	}
	
 
}
