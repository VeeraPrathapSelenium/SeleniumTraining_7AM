package com.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test01 extends UnderstandAnnotations{
	
	@Test(dataProviderClass=DataProvidingClass.class,dataProvider="prodCrdentials")
	public static void test1(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);

		System.out.println("Executing test 1");
		
	}

}
