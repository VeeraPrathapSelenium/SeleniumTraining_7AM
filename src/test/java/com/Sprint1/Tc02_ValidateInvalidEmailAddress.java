package com.Sprint1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericMethods.GenericMethods;
import com.PageFunctions.HomePage;
import com.PageFunctions.LoginPage;

public class Tc02_ValidateInvalidEmailAddress extends GenericMethods{
	
	
@Test
	
	public static void validate_InvalidEmailId()
	{
		boolean status;
		status=launchBrowser("ff");
		
		// get the status of the browser and click on the signin link
		
		if(status)
		{
			HomePage homepage=PageFactory.initElements(driver, HomePage.class);
			
			status=homepage.clickOnSignin();
			
			if(status)
			{
				LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
				
				loginpage.enterEmailId_CreateAccount();
			}
			
			
			
		}
		
		
		
	}



}
