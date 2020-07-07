package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	@FindBy(id="organization")
	private WebElement org;
	
	@FindBy(id="email")
	private WebElement EmailId;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(xpath="//*[@class='MuiIconButton-label']")
	private WebElement RememberMe;
	
	@FindBy(xpath="//*[contains(text(),'Sign In')]")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Login(String OrgName, String Email, String Password ) throws InterruptedException{

		org.sendKeys(OrgName);
		EmailId.sendKeys(Email);
		pwd.sendKeys(Password);
		RememberMe.click();
		Thread.sleep(6000);
		loginBtn.click();
		
		
		
	   }
	
	
	
		
	    
		
		
	
}
