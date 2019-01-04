package com.TestNgListeners;

import org.omg.CORBA.portable.InvokeHandler;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import com.Reporting.Reporting;

public class Listeners implements ITestListener,IInvokedMethodListener {

	
	public static String currentclass;
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("On Finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {	
		
		System.out.println("On Start");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("After Method");
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
			
		currentclass=arg1.getInstanceName().substring(arg1.getInstanceName().lastIndexOf(".")+1);
		
		Reporting.intializeReport(currentclass);
		Reporting.startReport(currentclass);
	}

}
