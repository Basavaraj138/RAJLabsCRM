package com.rajlabs.qa.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotofElement {

	/*@Test

	public void screenshotOfElement() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.orangehrm.com/");

		WebElement logo = driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-light fixed-top']//div//a//img[@alt='OrangeHRM Logo']"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\welcome\\Desktop\\screenshotElement\\orangehrmlogo.jpeg");
		FileUtils.copyFile(src, file);
		driver.quit();
	}

		@Test
		public void newtab()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			driver.get("https://www.orangehrm.com/");
			driver.switchTo().newWindow(WindowType.TAB);

			driver.navigate().to("https://www.amazon.in/");
			driver.quit();
		}

	@Test
	public void newwindow()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.orangehrm.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.navigate().to("https://www.amazon.in/");
		driver.quit();
	}*/

	@Test
	public void logosize() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.orangehrm.com/");
		WebElement logo = driver.findElement(By.xpath("//nav[@class='navbar navbar-expand-lg navbar-light fixed-top']//div//a//img[@alt='OrangeHRM Logo']"));

		System.out.println("Width "+logo.getRect().getDimension().getWidth());		
		System.out.println("Height "+logo.getRect().getDimension().getHeight());		
		
		System.out.println("X Location "+logo.getRect().getX());
		System.out.println("Y Location "+logo.getRect().getY());
		Thread.sleep(5000);
	}
}


