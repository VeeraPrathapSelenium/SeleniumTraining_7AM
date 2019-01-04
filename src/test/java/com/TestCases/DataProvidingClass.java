package com.TestCases;

import org.testng.annotations.DataProvider;

public class DataProvidingClass {
	
	@DataProvider(name="prodCrdentials")
	public static Object[][] getProdCredetials()
	{
		Object[][] arr= new Object[1][2];
		arr[0][0]="user01";
		arr[0][1]="pass12345";
		return arr;
		
	}
	
	@DataProvider(name="QACrdentials")
	public static Object[][] getQACredetials()
	{
		Object[][] arr= new Object[1][2];
		arr[0][0]="user01";
		arr[0][1]="pass12345";
		return arr;
		
	}
	

}
