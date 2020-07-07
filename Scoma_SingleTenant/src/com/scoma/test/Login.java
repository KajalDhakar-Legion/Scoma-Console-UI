package com.scoma.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.scoma.pages.LoginPage;

public class Login {
	
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "exe files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
	}
	
	@BeforeMethod
	public void launchApp()
	{
		driver.navigate().to("http://192.168.111.131/");
		
	}
	
	@Test
	
	public void loginApp() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.Login("Zorang", "sadhvi.gupta@zorang.com", "12345");
	}
	

	

}
