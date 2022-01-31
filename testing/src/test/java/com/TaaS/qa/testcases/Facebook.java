package com.TaaS.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TaaS.qa.data.ExcelReader;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class Facebook  extends CreateLogs
{

	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Description: create new account on facebook.")
	//@Link(name="Jira",url="")
	@Story("Empty field singup test")
	@Feature("singup")
	
	@DataProvider(name="ExcelData1")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcelReader ER = new ExcelReader();
		return ER.getExcelData();
	}

	@Test(priority=1,alwaysRun = true,dataProvider="ExcelData1")
	public void facebookNewAccount(String mail,String password) throws Exception
	{

		facebookAccountobject.createNewAccount(mail,"Roudiny","japivkk_panditstein_1643065615@tfbnw.net","ezg7vpj7aat","custom",2,5,"1960","nothing");
		WaitHelpherObject          .wait(50); 
		facebookAccountobject      .Logout();
		
	}





}
