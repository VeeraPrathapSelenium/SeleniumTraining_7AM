package com.PageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericMethods.GenericMethods;

public class LoginPage extends GenericMethods{
	
	//*************************** WebElements_CREATE AN ACCOUNT **********************
	

	@FindBy(how=How.XPATH,using="//input[@id='email_create']")
	public static WebElement txt_EmailId;
	
	@FindBy(how=How.XPATH,using="//button[@id='SubmitCreate']")
	public static WebElement btn_createAccount;
	
	@FindBy(how=How.XPATH,using="//li[text()='Invalid email address.']")
	public static WebElement txt_invalidmessage;
	
	
	//******************** Methods Declaration ************************
		//=================================================================
		/*
		 * MethodName:enterEmailId_CreateAccount
		 * Purpose:This method is used to enter the email id under create account section
		 * inputparameter:NA
		 * returntype:boolean
		 * datarequired:NA
		 * designer:Prathap
		 * date:12/29/2018	  
		 * ================================================================
		 */
		public static boolean enterEmailId_CreateAccount()
		{
			boolean status=true;
			try
			{
				new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='SubmitCreate']")));
				
				
				String emailid=getData("Testdata", "EmailId");
				
				
				status=clickAndSendData(txt_EmailId,emailid);
				// check if email id is enter sucessfully
				if(status)
				{
				logEvenet("pass", "Email id Entered sucessfully");
				
				// check if register button is clicked sucessfully
				status=hoverAndClick(btn_createAccount);
				
				if(status)
				{
					logEvenet("pass", "Register Button is clicked sucessfully");
					
					new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(txt_invalidmessage));
					
					if(txt_invalidmessage.isDisplayed())
					{
						logEvenet("pass", "invalid error messaage is displayed sucessfully");
					}
					
					
					
				}
				else
				{
					logEvenet("pass", "Register Button is not clicked sucessfully");
				}
				
				
				
				
				
				
				}else
				{
					logEvenet("fail", "Email id in not enter sucessfully");
				}
				
				
			}catch(Exception e)
			{
				status=true;
				System.out.println(e.getMessage());
				logEvenet("fail", "Failed to validate invalid error message "+e.getMessage());
			}
			return status;
		}
		
		

}
