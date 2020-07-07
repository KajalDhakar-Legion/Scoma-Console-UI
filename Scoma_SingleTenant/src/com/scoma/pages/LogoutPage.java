package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	private WebDriver driver;

	@FindBy(xpath="//*[@class='MuiSvgIcon-root']")
	private WebElement ProfileIcon;
	
	@FindBy(xpath="//*[@id='profile-menu-list-grow']/ul/li[2]")
	private WebElement LogoutBtn;
	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Logout( )
	{
		ProfileIcon.click();
		LogoutBtn.click();
	}	

}
