package com.rajlabs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rajlabs.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	public static String validateloginpage()
	{
		String title = driver.getTitle();
		return title;
		
	}
	@FindBy(id = "login:usernameDecorate:username")
	WebElement username;
	
	@FindBy(id = "login:passwordDecorate:password")
	WebElement password;
	
	@FindBy(id = "login:login")
	WebElement Login;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateloginpagetitle()
	{
		return driver.getTitle();
	}
	
	public Homepage Login(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		Login.click();
		return new Homepage();
	}
	
	
	
	
	
	
	
	
	
	

}
