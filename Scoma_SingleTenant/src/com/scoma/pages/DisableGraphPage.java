package com.scoma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisableGraphPage {

	
		private WebDriver driver;

		@FindBy(className="MuiSvgIcon-root")
		private WebElement DisableIcon;
		
		@FindBy(xpath="//*[@id='simple-menu']/div[3]/ul/li")
		private WebElement DisableButton;
		
		List<WebElement> list = driver.findElements(By.className(" css-tlfecz-indicatorContainer"));
		
		
		
		public DisableGraphPage(WebDriver driver2) {
			// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}

		public void DisableGraph()
		{
			DisableIcon.click();
			DisableButton.click();
			list.get(1).click();
		}
	}		

