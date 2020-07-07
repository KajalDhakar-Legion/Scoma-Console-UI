package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.scoma.utilities.BrowserFactory;

public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = BrowserFactory.startApplication(driver, "Chrome", "http://192.168.111.114/");
	}
	
	@AfterTest
	public void close()
	{
		BrowserFactory.quitApplication(driver);
	}
}
