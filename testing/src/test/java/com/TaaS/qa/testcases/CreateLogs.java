package com.TaaS.qa.testcases;
import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.runtime.Runtime.GetPropertiesResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.TaaS.qa.Pages.facebook_login;
import com.TaaS.qa.Pages.facebook_singup;
import com.TaaS.qa.Pages.logout;
import com.TaaS.qa.data.ExcelReader;
import com.TaaS.qa.utilities.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CreateLogs extends testBase
{
	public LoadProperties                 prop                    ;
	public String                         name                    ;
	public String                         url                     ;
	public Logger                         LOG                     ;
	public WaitHelpher     				  WaitHelpherObject       ;
	public Recorder                       RecorderObject          ;
    static screenshotFalilure             screenshotFalilureObject;
    public facebook_singup                facebookAccountobject   ;
    public facebook_login				  facebookloginobject     ;
    public logout						  logoutobject            ;


	@BeforeSuite
	public void initializ() 
	{
	  prop                     =new LoadProperties                 (          );
	  name                     =LoadProperties.userdata.getProperty("username");
	  url                      =LoadProperties.userdata.getProperty("URL"     );
	  WaitHelpherObject		   =new WaitHelpher                    (driver    );
	  screenshotFalilureObject =new screenshotFalilure             (driver    );	 
	  facebookAccountobject	   =new facebook_singup 			   (driver    );
	  facebookloginobject      =new facebook_login				   (driver    );
	  LOG                      =LogManager.getLogger               (CreateLogs.class.getName());
	  
	  
	}



	
	
	@BeforeClass(alwaysRun = true)
	public void setup() throws Exception
	{
		WaitHelpherObject.pageLoadTimeout  (testUntil.PAGE_LOAD_TIMEOUT);
	 	WaitHelpherObject.testImplicittwait(testUntil.IMPLICIT_WAIT);
/***************************Delete all cookies****************************************/
	 	driver.manage().deleteAllCookies ();
/***************************Maximize the size of the window****************************************/
		driver.manage().window().maximize();
/***************************lanuching*****************************************/
		driver.get(url      );
		
		 
	}

	
	
/*	
	public  void readFromProp()
	{
	
		WebDriverWait wait = new WebDriverWait(driver, 50); 
		//	assertEquals(loginObject.UserBtnColour(),"blue");as
		WebElement elementPresent=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(name);
		LOG.info("Read from file");

	}
	*/

	
	public  void record() throws IOException, AWTException
	{
		
/*******************graphic Configuration***********************/
		  GraphicsConfiguration gc=GraphicsEnvironment
			                	 .getLocalGraphicsEnvironment()
			                	 .getDefaultScreenDevice     ()
				                 .getDefaultConfiguration    ();
		/************************parameters for Recorder****
		 * 1-Graphics Configuration*
		 * 2-Rectangle capture area*
		 * 3-*************************/
		     RecorderObject= new Recorder (gc,
				                       null,
			                           null,
				                       null, 
				                       null, 
				                       null, 
				                       null, 
				                       null);
		
		
		
		
	}
}
