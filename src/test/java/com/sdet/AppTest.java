package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testloginCredentials() {
		System.out.println("it is from AppTest.java");
		App myapp=new App();
		
		int result = myapp.userLogin("Srini", "12345");
		System.out.println("Result of comaparison is: " + result);
		//if credentials are correct returns 0
		Assert.assertEquals(1,result);
	
	}
	
	@Test
	public void testSumOfNumbers() {
		int result = 4 + 4;
		Assert.assertEquals(8,result);
		//System.out.println("sum of the numbers is correct");
		
	}
	
	
	
	
}
