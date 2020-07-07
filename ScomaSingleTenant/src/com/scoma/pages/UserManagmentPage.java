package com.scoma.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagmentPage extends LoginPage
{

	@FindBy(xpath="//div[@class='MuiPaper-root MuiPaper-elevation0 MuiDrawer-paper "
			+ "Sidebar-drawerPaper-6 MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft']//div[contains(text(),'User Managment')]")
	public WebElement usermgmtTab;
	
	@FindBy(xpath="//button[contains(text(),'ADD USER')]")
	public WebElement addUserBtn;
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailAddress;
	
	@FindBy(xpath="password")
	public WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Add User')]")
	public WebElement submit;
	
	
	public UserManagmentPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void clickOnUserMgmtTab()
	{
		if(usermgmtTab.isDisplayed() && usermgmtTab.isEnabled())
			usermgmtTab.click();
		else
			throw new NoSuchElementException("= User Management tab is not found");
	}
	
	public void clickOnAddUser()
	{
		if(addUserBtn.isDisplayed() && addUserBtn.isEnabled())
			addUserBtn.click();
		else
			throw new NoSuchElementException("= Add User Button is not found");
	}
	
	public void createUser(String fname, String lname, String email, String pwd)
	{
		if(firstName.isDisplayed())
		{
			firstName.sendKeys(fname);
		}
		
		if(lastName.isDisplayed())
		{
			lastName.sendKeys(lname);
		}
		
		if(emailAddress.isDisplayed())
		{
			emailAddress.sendKeys(email);
		}
		
		if(password.isDisplayed())
		{
			password.sendKeys(pwd);
		}
	}
	
	public void submitinfo()
	{
		submit.click();
	}
}
