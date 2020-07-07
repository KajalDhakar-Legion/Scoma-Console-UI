package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisualizerPage extends LoginPage
{
	@FindBy(xpath="//div[@class='userTable-wrapper-1101']//div[@class='MuiListItemText-root Sidebar-itemText-19' and contains(text(),'Visualizer')]")
	private WebElement visualizer;
	
	public VisualizerPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickbtn()
	{
		visualizer.click();
	}
	

}
