package com.scoma.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage extends LoginPage
{
	@FindBy(xpath="//div[@class='MuiPaper-root MuiPaper-elevation0 MuiDrawer-paper Sidebar-drawerPaper-6 MuiDrawer-paperAnchorLeft"
			+ " MuiDrawer-paperAnchorDockedLeft']//div[contains(text(),'Training')]")
	public WebElement training_Btn;
	
	@FindBy(xpath="//span[contains(text(),'Upload Files')]")
	public WebElement uploadfiles_Btn;
	
	@FindBy(xpath="//p[contains(text(),'Click or drag file to this area to upload')]")
	public WebElement areaToUpload;
	
	@FindBy(xpath="//span[contains(text(),'Analytics')]")
	public WebElement analyticsBtn;
	
	public TrainingPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	
	public void click_training()
	{
		if(training_Btn.isDisplayed())
		{
			training_Btn.click();
		}
		else
			System.out.println("Field is not displayed");
	}
	
	public void click_uploadfiles()
	{
		if(uploadfiles_Btn.isDisplayed() && uploadfiles_Btn.isEnabled())
		{
			uploadfiles_Btn.click();
		}
		else
			System.out.println("button is not displayed");
	}
	
	public void clickOnAreaToUplaod()
	{
		if(areaToUpload.isEnabled())
		{
			areaToUpload.click();
		}
		else
			throw new NoSuchElementException("= Element is not found");
	}
	
	public void clickOnAnalytics()
	{
		if(analyticsBtn.isDisplayed() && analyticsBtn.isEnabled())
		{
			analyticsBtn.click();
		}
		else 
			throw new NoSuchElementException("= Element is not found");
	}
}
