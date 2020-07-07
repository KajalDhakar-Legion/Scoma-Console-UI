package com.scoma.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory 
{
	
	public static WebDriver startApplication(WebDriver driver,String browserName , String appUrl)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("Firefox"))
		{
			
		}
		else
		{
			System.out.println("we do not know this browser");
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		
		return driver;
	}
	
	public static void quitApplication(WebDriver driver)
	{
		driver.quit();	
	}
	

}
