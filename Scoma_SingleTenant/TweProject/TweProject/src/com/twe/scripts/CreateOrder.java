package com.twe.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateOrder 
{
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://development-na01-treasurywineestates.demandware.net/s/Etude/en/home");
	}
	
  @Test(priority=1)
  public void logIn_app() 
  {
	  driver.findElement(By.className("login")).click();
	  driver.findElement(By.name("loginEmail")).sendKeys("Camille.pipes@yopmail.com");
	  driver.findElement(By.name("loginPassword")).sendKeys("Test@1234");
	  driver.findElement(By.xpath("//button[text()='Log In']")).click();
  }
  
  @Test(priority=2)
  public void createCustomer()
  {
	  driver.findElement(By.className("login")).click();
	  
  }
}
