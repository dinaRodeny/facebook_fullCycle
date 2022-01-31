package com.TaaS.qa.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener	
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		System.out.println("lanuching");
	
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		// TODO Auto-generated method stub
		System.out.println("great");
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		System.out.println("Failure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	

}
