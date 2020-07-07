package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage implements LoginApplication
{
	@FindBy(id="organization")
	private WebElement orgName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(xpath="//*[contains(text(),'Sign In')]")
	private WebElement signbtn;

	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	@Override
	public void login(String org, String emailAddress, String password) throws Exception {
		orgName.sendKeys(org);
		email.sendKeys(emailAddress);
		pwd.sendKeys(password);
		signbtn.click();
	}


	@Override
	public void googleSignIn() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
