package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	private WebDriver driver;

	@FindBy(xpath="//*[contains(text(),'Analytics')]")
	private WebElement Analytics;
	
	@FindBy(xpath="//*[contains(text(),'Visualizer')]")
	private WebElement Visualizer;
	
	@FindBy(xpath="//*[contains(text(),'Training')]")
	private WebElement Training;
	
	@FindBy(xpath="//*[contains(text(),'User Managment')]")
	private WebElement UserManagment;
	
	@FindBy(xpath="//*[contains(text(),'Document Managment')]")
	private WebElement DocumentManagment;
	
	@FindBy(xpath="//*[contains(text(),'Config')]")
	private WebElement Config;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void Dashboard( )
	{
		Analytics.isDisplayed();
		Visualizer.isDisplayed();
		UserManagment.isDisplayed();
		DocumentManagment.isDisplayed();
		UserManagment.isDisplayed();
		Config.isDisplayed();
	}
}
