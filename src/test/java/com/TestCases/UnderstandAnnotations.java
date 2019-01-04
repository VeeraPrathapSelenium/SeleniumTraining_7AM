package com.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnderstandAnnotations {
	
	@BeforeSuite()
	public static void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite()
	public static void afterSuite()
	{
		System.out.println("after suite");
	}
	
	@BeforeClass
	public static void beforeclass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public static void afterclass()
	{
		System.out.println("after class");
	}
	
	@BeforeTest
	public static void beforetest()
	{
		System.out.println("before test");
	}
	@AfterTest
	public static void aftertest()
	{
		System.out.println("after test");
	}
@BeforeMethod
	public static void beforemethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public static void aftermethod()
	{
		System.out.println("after method");
	}
	
	
	
	
	
	
	
	

}
