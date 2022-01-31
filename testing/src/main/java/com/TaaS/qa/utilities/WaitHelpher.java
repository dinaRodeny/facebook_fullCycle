package com.TaaS.qa.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitHelpher
{

	private  static WebDriver driveConstructor;

	public  WaitHelpher(WebDriver Driver)
	{
		driveConstructor=Driver;
	}

	/*
	/************************************************************************************************************
	 *Use function to wait using implicit function
	 *parameter in: Long implicit wait
	 *parameter out: void
	 ***********************************************************************************************************/

	public void testImplicittwait( long iMPLICIT_WAIT )
	{
		/*Set the implicitly wait by anytime in seconds for selenium4*/
		driveConstructor.manage().timeouts().implicitlyWait(Duration.ofSeconds(iMPLICIT_WAIT));
	}
	/*
	/************************************************************************************************************
	 *Use function to make sure the page loaded 
	 *parameter in: Page_Load_Timeout
	 *parameter out: void
	 ***********************************************************************************************************/

	public void pageLoadTimeout(long Page_Load_Timeout )
	{
		/*****************************Set time for page loading for selenium4*/
		driveConstructor.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Page_Load_Timeout));
		//driveConstructor.manage().timeouts().pageLoadTimeout(Page_Load_Timeout , TimeUnit.SECONDS);
	}

	/*
	/************************************************************************************************************
	 *Use function for waiting until element is clickable,presencet and visible (Expilicit function)
	 *parameter in: Xpath and waitingTime
	 *parameter out: void
	 ***********************************************************************************************************/

	public void waitForElementCombo( By locator,int waitingTime)
	{
	/**********************************Expected waiting time*********************************************************/
	WebDriverWait waitVisbility = new WebDriverWait(driveConstructor,waitingTime);
	WebDriverWait waitpresence  = new WebDriverWait(driveConstructor,waitingTime);
	WebDriverWait waitClickable = new WebDriverWait(driveConstructor,waitingTime);
    /**********************************wait until Element is visible********************************************/
	waitVisbility.until(ExpectedConditions.visibilityOfElementLocated(locator));
	/**********************************wait until Element is Exist********************************************/
	waitpresence .until(ExpectedConditions.presenceOfElementLocated  (locator)); 
	/**********************************wait until Element is clickable******************************************/
	waitClickable.until(ExpectedConditions.elementToBeClickable      (locator));
	
	}
	
	
	/*
	/************************************************************************************************************
	 *Use function for waiting until element is clickable,presencet and visible (Expilicit function)
	 *parameter in: Xpath and waitingTime
	 *parameter out: void
	 ***********************************************************************************************************/

	public void waitCombo( By locator,int waitingTime)
	{
	/**********************************Expected waiting time*********************************************************/
	WebDriverWait waitVisbility = new WebDriverWait(driveConstructor,waitingTime);
	WebDriverWait waitpresence  = new WebDriverWait(driveConstructor,waitingTime);
    /**********************************wait until Element is visible********************************************/
	waitVisbility.until(ExpectedConditions.visibilityOfElementLocated(locator));
	/**********************************wait until Element is Exist********************************************/
	waitpresence .until(ExpectedConditions.presenceOfElementLocated  (locator)); 
	
	
	}

	/************************************************************************************************************
	 *Use function for waiting until element is  visible (Explicit wait)
	 *parameter in: Xpath and waitingTime
	 *parameter out: return webelement
	 **********************************************/
	
	public WebElement waitForElement( By locator,int waitingTime)
	{

		WebDriverWait wait = new WebDriverWait( driveConstructor,waitingTime);
	/**********************************wait until Element is visible********************************************/
		WebElement element   = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return  element;
	}
	
	/************************************************************************************************************
	 *Use function for waiting until element is  visible (Explicit wait)
	 *parameter in: Xpath and waitingTime
	 *parameter out: return webelement
	 **********************************************/
/*	
	public WebElement waitForElementFluentWait( By locator,int waitingTimeSec,int pollingTime)
	{
	
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driveConstructor)							
			.withTimeout(Duration.ofSeconds(waitingTimeSec)) 			
			.pollingEvery(Duration.ofSeconds(pollingTime)) 			
			.ignoring(NoSuchElementException.class);
	    WebElement clickseleniumlink = null ;//= wait.until(new Function<WebDriver, WebElement>();
		return clickseleniumlink;
	}
	*/
}
