package com.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 extends UnderstandAnnotations{
	@Parameters({"browser"})
	@Test
	public static void test2(String browser)
	{
		System.out.println(browser);
		
		System.out.println("Executing test 2");
		
	}

}
