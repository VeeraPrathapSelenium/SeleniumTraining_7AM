package com.Sprint1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.GenericMethods.GenericMethods;
import com.PageFunctions.HomePage;

public class Tc01_ValidateSignin extends GenericMethods{
	
	
	
	
	
	@Test
	
	public static void validate_Sigin()
	{
		boolean status;
		status=launchBrowser("ff");
		
		// get the status of the browser and click on the signin link
		
		if(status)
		{
			HomePage homepage=PageFactory.initElements(driver, HomePage.class);
			
			homepage.clickOnSignin();
			
		}
		
		
		
	}


}
