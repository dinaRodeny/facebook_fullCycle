package com.TaaS.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebook_login extends PageBase
{
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because I inherited from PageBase class 
	 ***********************************************************************************************************/
	public facebook_login  (WebDriver Driver)
	{
		super(Driver);
	}

	@FindBy(id="email")
	WebElement emailTxtBox;
	
	@FindBy(id="pass")
	WebElement passWordTxtBox;
	
	@FindBy(css="button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	WebElement loginBtn;
	
	@FindBy(css="button[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	WebElement Homepage_verification;
	

	public void  Login(String mail,String password) throws Exception
	{
		
		

		setTextElementText     ( emailTxtBox        ,mail       );
		setTextElementText     ( passWordTxtBox     ,password   );
		clickButton            ( loginBtn                       );
		
	}

}
