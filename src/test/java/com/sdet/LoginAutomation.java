package com.sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class LoginAutomation {

	@Test
    //JavascriptExecutor test that enters userid, password and create an alert
	public void login() {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('enter correct login credentials to continue');");
		System.out.println("it is from LoginAutomation.java");
		sleep(2);
		/*
		 alert = driver.switchTo().alert();
	        //Store the alert text in a variable and verify it
	        text = alert.getText();
	        assertEquals(text, "Are you sure?");
	        //Press the Cancel button
	         
	         */
	}

	public static void sleep(int ms) {
		try

		{
			Thread.sleep(ms);
		} catch (InterruptedException e)

		{
			e.printStackTrace();
		}

	}
}