package com.rajlabs.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignupTest {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void testmethod1()
	{
		System.out.println("testmethod1");
	}
  
	@Test
	public void testmethod2()
	{
		System.out.println("testmethod2");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
