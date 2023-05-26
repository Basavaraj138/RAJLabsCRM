package com.rajlabs.qa.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Logintest {

		
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
		
	}
	
	

		
	@Test(priority=2)
	public void verifylogintitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority = 3)
	public void verifyorangeHRMlogo()
	{
	boolean logo=driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-light fixed-top']//div//a//img[@alt='OrangeHRM Logo']")).isDisplayed();

	}
	@Test(priority=4)
	public void Logincredentials()
	{
		driver.findElement(By.id("Form_getForm_subdomain")).sendKeys("Kiran Patil");
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Kirti");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("kirti123@gmail.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("7899108192");
		driver.findElement(By.id("Form_getForm_Country")).sendKeys("India");
		driver.findElement(By.cssSelector("div[class='recaptcha-checkbox-border']")).click();
		driver.findElement(By.cssSelector("Form_getForm_action_submitForm")).click();
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}