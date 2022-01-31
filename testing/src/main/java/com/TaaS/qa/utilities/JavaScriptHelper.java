package com.TaaS.qa.utilities;
import static org.testng.Assert.assertEquals;

import java.net.http.HttpClient;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptHelper
{
	private static JavascriptExecutor javascriptExecutor ;

	public JavaScriptHelper(WebDriver driver)
	{
		javascriptExecutor = (JavascriptExecutor)driver;
	}



	/************************************************************************************************************
	 *Get the Title and compare it with the expected one
	 *parameter in:Expected title
	 *parameter out: void
	 ***********************************************************************************************************/
	static public void JavaaScriptGetTitle(String expectedTitle)
	{

		System.out.print(javascriptExecutor);
		String Actualtitle =(String)javascriptExecutor.executeScript("return document.title");  
		assertEquals(expectedTitle,Actualtitle);
	} 

	/************************************************************************************************************
	 *Scroll to the bottom of the page
	 *parameter in:void
	 *parameter out: void
	 ***********************************************************************************************************/
	static public void TestScrollBottomJS() 
	{
		javascriptExecutor.executeScript("scrollTo(0,document.body.scrollHeight)");

	}
	/************************************************************************************************************
	 *Scroll by a specific amount
	 *parameter in:void
	 *parameter out: void
	 ***********************************************************************************************************/
	static public void TestScrollSpecificvalueJS(int Xaxis,int Yaxis)
	{
		javascriptExecutor.executeScript("scrollby(Xaxis,Yaxis)");
	}
	/************************************************************************************************************
	 *Check the broken images
	 *parameter in:void
	 *parameter out: void
	 ***********************************************************************************************************/
	/*static public void checkAllBrokenImages()
	{

		HttpClient client= HttpClientBuilder.

	}*/






}





