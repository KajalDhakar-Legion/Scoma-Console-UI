package com.scoma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chatbotpage extends LoginPage
{
	@FindBy(className = "rcw-launcher")
	private WebElement chatbot_btn;
	
	@FindBy(xpath="//div[@class='list-group w-100']//a[contains(text(),' Analyse a contract')]")
	private WebElement chatbot_opt1;
	
	@FindBy(xpath="//div[@class='list-group w-100']//a[contains(text(),'Contract expiring in upcoming months')]")
	private WebElement chatbot_opt2;
	
	@FindBy(xpath="//div[@class='list-group w-100']//a[contains(text(),'Company wise contract count')]")
	private WebElement chatbot_opt3;
	
	@FindBy(xpath="//div[@class='list-group w-100']//a[contains(text(),'Region wise contract count')]")
	private WebElement chatbot_opt4;
	
	@FindBy(xpath="//div[@class='list-group w-100']//a[contains(text(),'Summarize a contract')]")
	private WebElement chatbot_opt5;
	
	//public int options;
	
	public Chatbotpage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void click_chatbot()
	{
		if(chatbot_btn.isDisplayed())
		{
			chatbot_btn.click();
		}
		else
		{
			System.out.println("Button is not displayed");	
		}	
	}
	
	public void chatbot_options(int options)
	{
		switch (options) 
		{
		case 1:
			chatbot_opt1.click();
			break;
			
		case 2:
			chatbot_opt2.click();
			break;
			
		case 3:
			chatbot_opt3.click();
			break;
			
		case 4:
			chatbot_opt4.click();
			break;
			
		case 5:
			chatbot_opt5.click();
			break;
		}
	}

	
}
