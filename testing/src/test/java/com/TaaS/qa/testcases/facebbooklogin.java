package com.TaaS.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class facebbooklogin extends CreateLogs
{
	

	@Severity(SeverityLevel.CRITICAL)
    @Description("Test Description: login on facebook.")
	//@Link(name="Jira",url="")
    @Story("login using valid username and password")
	@Feature("singin")
	@Test(priority=1)
	public void Login() throws Exception
	{
	
		facebookloginobject. Login("japivkk_panditstein_1643065615@tfbnw.net","ezg7vpj7aat");
		WaitHelpherObject.wait(70);
		logoutobject.Exit();
	}

}
