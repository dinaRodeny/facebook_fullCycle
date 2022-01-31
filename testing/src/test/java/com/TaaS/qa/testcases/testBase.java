package com.TaaS.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.TaaS.qa.utilities.WaitHelpher;

public class testBase
{
	public static WebDriver  driver            = null;
	    
	@BeforeSuite
	@Parameters(("Browser"))
	public void webdriver(@Optional("chrome")String browserName)
	{

		/*Dec for caps*/
		DesiredCapabilities capabilities= new DesiredCapabilities();
		ChromeOptions options_Chrome    = new ChromeOptions();
		FirefoxOptions options_firefox  = new FirefoxOptions();


		/**************if condition to Swap between Browsers using testNG*****************/
		/**************************Incoginto_Chrome*********************************/	
		if(browserName.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver2\\chromedriver.exe");	

			/*************Incognito->open chrome browser in incognito mode****************************/			/*Hint:Since we want to open Chrome browser in incognito mode, 
            /*you need to pass the argument –incognito 
			 *to Chrome Options class.
			 **/
			options_Chrome.addArguments("--incognito");
			/* create an object of Desired Capabilities class and merge 
			 * the Desired Capabilities class object with Chrome Options 
			 * class object using merge method	
			 */
			capabilities .setCapability(ChromeOptions.CAPABILITY,  options_Chrome);
			options_Chrome.merge(capabilities);
			/* You need to create an object of Chrome Driver class and
			 *  pass the Chrome Options object as an argument
			 */
			driver = new ChromeDriver(options_Chrome);		
		}

		/****************************incoginto_Firefox*******************************************/		

		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			/*************Incognito->open firefox browser in incognito mode****************************/
			/*Hint:Since we want to open firefox browser in incognito mode, 
			 *you need to pass the argument –private
			 *to Chrome Options class.*/			
			options_firefox.addArguments("-private");
			/* create an object of Desired Capabilities class*/
			capabilities.setCapability("moz:firefoxOptions",options_firefox);
			driver = new FirefoxDriver(options_firefox);	
		}
		/****************************incoginto_ie*******************************************/		
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		
	}	
	
	

}
