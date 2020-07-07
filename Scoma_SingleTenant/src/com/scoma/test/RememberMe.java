package com.scoma.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.scoma.pages.LoginPage;
import com.scoma.pages.LogoutPage;

public class RememberMe {

WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "exe files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("http://192.168.111.114/login");
	}
	
	
	@Test(priority=0)
	
	public void loginApp() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.Login("Zorang", "sadhvi.gupta@zorang.com", "12345");
	}

	@Test(priority=1)
	public void LogoutApp() throws InterruptedException
	
	{
		Thread.sleep(25000);
		LogoutPage LogoutApp = new LogoutPage(driver);
		LogoutApp.Logout();
		
	}
	
}
