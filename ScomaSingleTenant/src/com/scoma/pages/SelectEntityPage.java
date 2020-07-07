package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectEntityPage extends LoginPage{

	
	
	@FindBy(xpath="//*[contains(text(),'Visualizer')]")
	private WebElement Visualizer;
	
	@FindBy(xpath = "/div[@class='MuiGrid-root GridContainer-grid-233 MuiGrid-container']/child::div[1]")
	private WebElement clickOnSelectEntity;
	
	@FindBy(name = "Second party")
	private WebElement SelectEntity;
	
	@FindBy(xpath = "/div[@class='MuiGrid-root GridContainer-grid-233 MuiGrid-container']/child::div[2]")
	private WebElement ClickOnSecondParty;
	
	@FindBy(name = "ContentStack, inc")
	private WebElement ClickOnEntity;
	
	public SelectEntityPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	public void SelectEntity()
	{
		Visualizer.click();
		clickOnSelectEntity.click();
		SelectEntity.click();
		ClickOnSecondParty.click();
		ClickOnEntity.click();
	}
}
