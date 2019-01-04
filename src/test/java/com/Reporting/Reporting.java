package com.Reporting;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.GenericMethods.GenericMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting {
	
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	// 1. intilize the reports
	
	public static void intializeReport(String testcase) {
		
		extent=new ExtentReports(check_CreateResultFolder()+"\\"+testcase+".html");
		
		extent.addSystemInfo("Sprint #"," Sprint 1")
		.addSystemInfo("Cycle","01")
		.addSystemInfo("Environmen","QA");		
		
	}
	
	// 2. start the report
	public static void startReport(String testcase)
	{
		test=extent.startTest(testcase);
	}
	// 3. log the event
	
	public static void logEvenet(String status,String description)
	{
		switch(status.toLowerCase())
		{
		case "pass":
			test.log(LogStatus.PASS, description+test.addBase64ScreenShot(getScreenShot()));
			break;
		case "fail":
			test.log(LogStatus.FAIL, description+test.addBase64ScreenShot(getScreenShot()));
			break;
		case "warning":
			test.log(LogStatus.WARNING, description);
			break;
		
		
		}
	}
	// 4. flush the report
	
	public static void endReport()
	{
		extent.flush();
		extent.endTest(test);
		extent.close();
	}
	
	
	
	
	
	
	
	public static String check_CreateResultFolder()
	{
		Date d=new Date();

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");

		System.out.println(sdf.format(d));



		String Resultspath=System.getProperty("user.dir")+"\\Results\\"+sdf.format(d);


		File f=new File(Resultspath);
		if(!f.exists())
		{
			System.out.println("No Folder is exist......creating a new folder");
			f.mkdirs();
		}
		return Resultspath;
	}
	
	
	public static String getScreenShot()
	{
		TakesScreenshot sht=(TakesScreenshot)GenericMethods.driver;
		
		String screenprint=sht.getScreenshotAs(OutputType.BASE64);
		
		return "data:image/png;base64,"+screenprint;
		
	}
	
	
	
	
	
	
	

}
