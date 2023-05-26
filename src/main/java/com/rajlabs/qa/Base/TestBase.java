package com.rajlabs.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\Eclipse2\\Rajlabscrm"
					+ "\\src\\main\\java\\com\\rajlabs\\qa\\config\\Config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void intialization()
	{
   String browsername = prop.getProperty("browser");
   if(browsername.equals("chrome"))
   {
	   driver=new ChromeDriver();
	   
   }
   else
   {
	   driver=new FirefoxDriver();
   }
   
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

   
   driver.get(prop.getProperty("url"));
	}

}














