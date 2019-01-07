package com.PageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GenericMethods.GenericMethods;

public class HomePage extends GenericMethods {
	
	
	//******************** Menu Objects ************************
	
	@FindBy(how=How.XPATH,using="//a[normalize-space(text())='Sign in']")
	public static WebElement Lnk_Signin;
	
	
	//******************** Methods Declaration ************************
	//=================================================================
	/*
	 * MethodName:clickOnSignin
	 * Purpose:This method is used to click on the signin link of the hommepage
	 * inputparameter:NA
	 * returntype:boolean
	 * datarequired:NA
	 * designer:Prathap
	 * date:12/29/2018	  
	 * ================================================================
	 */
	public static boolean clickOnSignin()
	{
		boolean status=true;
		try
		{
			new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space(text())='Sign in']")));
			Lnk_Signin.click();
			
			logEvenet("pass", "Signin link is clicked sucessfully");
		}catch(Exception e)
		{
			status=true;
			System.out.println(e.getMessage());
			logEvenet("fail", "Signin link is not clicked sucessfully");
		}
		return status;
	}
	
	
	

}
