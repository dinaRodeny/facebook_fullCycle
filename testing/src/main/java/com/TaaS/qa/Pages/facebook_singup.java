package com.TaaS.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook_singup  extends PageBase
{
	/************************************************************************************************************
	 *Create constructor:constructor's name is equivalent to class Name
	 *parameter:webdriver 
	 *Super keyword:because I inherited from PageBase class 
	 ***********************************************************************************************************/
	public facebook_singup (WebDriver Driver)
	{
		super(Driver);
	}
	
	
	@FindBy (linkText = "Create New Account")
	WebElement   SingupBtn ;

	@FindBy(name="firstname")
	WebElement    FirstnameTxtBox; 
	
	
	@FindBy(name="lastname")
	WebElement     SurnameTxtBox; 
	
	@FindBy(name="reg_email__")
	WebElement      MailTxtBox;
	
	
	@FindBy (name="reg_email_confirmation__")
    WebElement ConfirmationEmail;
	
	@FindBy (name="reg_passwd__")
	WebElement     PasswordTxtBox;
	
	@FindBy (id="day")
	WebElement Day;
   

	@FindBy (id="month")
	WebElement Month;
	

	@FindBy (id="year")
	WebElement Year;

	
	@FindBy (css  ="input[value='1']")
	WebElement    GenderFemaleRdoBtn ;
	
	@FindBy (css  ="input[value='2']")
	WebElement    GendermaleRdoBtn ;
	
	@FindBy (css  ="input[value='-1']")
	WebElement   GendercustomRdoBtn ;
	
	@FindBy (name  ="websubmit")
	WebElement   Submit ;
	
	@FindBy (name="preferred_pronoun")
	WebElement   pref_custom ;


	@FindBy (name="custom_gender")
	WebElement  Gendaroption ;
	
	@FindBy(linkText = "Log Out")
	public WebElement logOutBtn;
	
	
	

	
	/*
	/************************************************************************************************************
	 *Use the firstname,lastname and birth date  email and password to singup on Facebook
	 *parameter in:Firstname,surname,mail,password,gender and the birth date
	 *parameter out: void
	 ***********************************************************************************************************/
	public void  createNewAccount(String firstName, String surName,String mail,String pwd,String gender,int day ,int month,String year,String customOptionl ) throws Exception
	{
		clickButton            ( SingupBtn                             );
		setTextElementText     ( FirstnameTxtBox        ,firstName     );
		setTextElementText     ( SurnameTxtBox          ,surName       );
		setTextElementText     ( MailTxtBox             ,mail          );
		setTextElementText     ( ConfirmationEmail      ,mail          );
		setTextElementText     ( PasswordTxtBox         ,pwd           );
		if (gender.equals      ("custom"))
		{
			clickButton        ( GendercustomRdoBtn                    );
			SelectDropDownindex(pref_custom           ,2               );
			setTextElementText (   Gendaroption       ,customOptionl   );
		}
		
		else if (gender.equals  ("male"))
	    clickButton             ( GendermaleRdoBtn                      );
		else if (gender.equals  ("female"))
	    clickButton             ( GenderFemaleRdoBtn                    );
		else
		clickButton             ( GendermaleRdoBtn                      );
		SelectDropDownDate      ( Year                 ,year,
				                  Month                ,month,
				                  Day                  ,day             );
		clickButton             ( Submit                                );
		/*
		SelectDropDowTxt  ( Day                 ,day          );
		SelectDropDowTxt  ( Month               ,month        );
		SelectDropDowTxt  ( Year                ,year         );
		*/
	    
	
		 /*
************************************Before Refactoring***************************************************************
		 firstnameTxtBox     .sendKeys  (firstName);
		 surName             .sendKeys  (surName);
		 emailTxtBox         .sendKeys  (mail     );
		 passwordTxtBox      .sendKeys  (pwd      );
		 singupBtn           .click     (         );
		 gendercustomRdoBtn  .click     (         );
		 */
		 
	}


	
	public void  Logout()
	{
		
		clickButton        (logOutBtn                   );
		
	}

}
