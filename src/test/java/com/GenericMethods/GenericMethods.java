package com.GenericMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Reporting.Reporting;

public class GenericMethods extends Reporting {
	
	public static WebDriver driver;
	
	public static boolean launchBrowser(String browsertype)
	{
		boolean status=true;
		try
		{
			System.out.println("Launching browser.......");
			switch(browsertype.toLowerCase())
			{
			case "ff":
				driver=new FirefoxDriver();
				break;
				
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver=new ChromeDriver();
				break;
				}
			
			// send the url to the browser
			
			String url="http://automationpractice.com/index.php";
			
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Browser is launched Sucessfully");
			logEvenet("pass", "Browser is launched sucessfully");
			
		}catch(Exception e)
		{
			status=false;
			System.out.println(e.getMessage());
			logEvenet("fail", "Browser is not launched sucessfully "+e.getMessage());
		}
		
		
		
		
		
		return status;
		
	}
	
	
	
	

}
