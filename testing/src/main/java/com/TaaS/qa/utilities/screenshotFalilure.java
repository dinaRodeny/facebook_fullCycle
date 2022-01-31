package com.TaaS.qa.utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class screenshotFalilure 
{
	
	private  static WebDriver driver;

	public  screenshotFalilure (WebDriver Driver)
	{
		driver=Driver;
	}
/************************************************************************************************************
	 *Check failure using testNG*
	 *parameter in: Driver,name of the test case
	 *parameter out:void
 
****************************************************************************/
	public void screenshot( WebDriver driver,String screenshotName)
	{
	Path des= Paths.get("./screenshots/",screenshotName+ ".png");
	try 
	{
		Files.createDirectories(des.getParent());
		FileOutputStream out = new FileOutputStream(des.toString());
		/*
		 * we are using the getScreenShotAs method after casting the driver object to the TakesScreenshot interface type.
		 */
		
	
	 out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
	 out.close();
	} 
	
	catch (IOException e) 
	{
		System.out.println("Error while taking screenshot"+e.getMessage());
	}
	
	}

	
	/*
/************************************************************************************************************
	 *Check failure using testNG*
	 *parameter in:void
	 *parameter out:void
 * @throws IOException 
***********************************************************************************************************
	public void screenshot(ITestResult result) throws IOException
	{
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			//Create reference to take screenshot
			TakesScreenshot ts=(TakesScreenshot)screenshot;				
/*********take screenshot and convert it to file *************		
		File source = ts.getScreenshotAs(OutputType.FILE);
/********Add the destination for screenshots******************
		FileUtils.copyFile(source, new File("/screenshots/"+result.getName()+".png"));
		
		}
		
	}*/
		
		
		
	
}
