package com.TaaS.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logout extends PageBase
{
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because I inherited from PageBase class 
	 ***********************************************************************************************************/
	public logout (WebDriver Driver)
	{
		super(Driver);
	}
	@FindBy(xpath="//*[@id=\"mount_0_0_LP\"]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")
	WebElement logoutBtn;
	
	@FindBy(xpath = "//*[@id=\"mount_0_0_tI\"]/div/div[1]/div/div[2]/div[4]/div[1]/div[3]/div[1]/span")
	public WebElement logoutmenuBtn;


	@FindBy (css="a[class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 qg6bub1s fe6kdd0r mau55g9w c8b282yb iv3no6db o0t2es00 f530mmz5 hnhda86s oo9gr5id']")
	public	WebElement welcomeMessage;
	
	@FindBy (css="span[class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7']")
	public	WebElement accountName;
	
	@FindBy(linkText = "Log Out")
	public WebElement logOutBtn;
	
	/*
	/************************************************************************************************************
	 *Use logut to assert that the homepage opens succesfully
	 *parameter in:Firstname,surname,mail,password,gender and the birth date
	 *parameter out: void
	 ***********************************************************************************************************/
	public void Exit()
	{

		clickButton            (logoutmenuBtn                      );
	
	}
	
}
