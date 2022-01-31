package com.TaaS.qa.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.Color;
import java.util.List;
public class PageBase 
{

	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 ***********************************************************************************************************/
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}

	/*
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Use in Button ->code be more readeable 
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected static void clickButton(WebElement jobsBttn)
	{

		jobsBttn.click();
	}
	/*
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Use in textfield->more readable 
	 * Paramter in:WebElement textElement ,String ValueAddedInText
	 * Paramter out: Void
	 */
	protected static void setTextElementText(WebElement textElement ,String ValueAddedInText) throws Exception

	{    if(ValueAddedInText !="")
	{

		textElement.sendKeys(ValueAddedInText);
	}
	else 
	{


		throw new Exception("Empty key");

	}


	}


	/*
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Use in Button ->code be more readeable 
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected String textColourForBtn(WebElement Button)
	{

		//String colour_RGB =Button.getCssValue("color").toString();


		//return Button.style.backgroundColor;
		return Button.getCssValue("color").toString();
	}


	/*this function get the size of the entire list
	 * parameter in: list and value of the index
	 * parameter out:void
	 */
	protected static void chooseFromlist( List<WebElement> MyList,int index)
	{


		MyList.get(index).click();
	}

	/*
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Use in Button ->code be more readeable 
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected  static String backgroundColourBtn(WebElement Button)
	{

		return  Button.getCssValue("background-color").toString();

	}





	/*this function gonna select from the list 
	 * parameter in: list and value of the index
	 * parameter out:void
	 */
	protected static void listSize(List<WebElement> MyList,WebElement textElement,By ValueAddedInText)
	{

		textElement.findElements(ValueAddedInText);
	}



	/*
	 * this function gonna select from the dropdown menu by text 
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected static void SelectDropDowTxt(WebElement element,String text) 
	{

		Select select = new Select(element);
		select.selectByVisibleText(text);
	}



	/*
	 * this function gonna select from the dropdown menu by value
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected static void SelectDropDowValue(WebElement element, String text) 
	{

		Select select = new Select(element);
		select.selectByValue("text");
	}





	/*
	 * this function gonna select from the dropdown menu for date validation
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected static void SelectDropDownDate(WebElement year,String yearVal,WebElement month,int monthVal,WebElement day, int dayhVal) throws Exception
	{
		
		
		if(dayhVal<=31)
		{
			Select select = new Select( day);
			select.selectByIndex      (dayhVal);
		}	
		else
			throw new Exception       ("no days by this value exist ya D");
		
		if((monthVal)<=12)
		{
			Select select = new Select( month);
			select.selectByIndex      (monthVal);
		}
		else
				throw new Exception       ("no month by this value exist ya D");

		if((Integer.valueOf(yearVal))<2006)
		{
		    Select select = new Select( year);
			select.selectByVisibleText(yearVal);
		}
		else
			throw new Exception       ("No year by this value exist ya D");
			

	}

	/*
	 * this function gonna select from the dropdown menu by index
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected static void SelectDropDownindex(WebElement element,int val) 
	{

		Select select = new Select(element);
		select.selectByIndex(val);
	}


	/*
	 * Protected ->thus no one can access outside the page package 
	 * Static -> i can access without  doing an object from a class ,coz,
	 * Static is a method that belongs to a class rather than an instance of a class
	 * Paramter in:WebElement Button
	 * Paramter out: Void
	 */
	protected static void checkBox(WebElement Button)
	{

		if(!(Button.isSelected()))
		{
			Button.click();
		}

	}


}


