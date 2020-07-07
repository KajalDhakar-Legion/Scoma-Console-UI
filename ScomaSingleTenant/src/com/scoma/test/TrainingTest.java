package com.scoma.test;

import org.testng.annotations.Test;

import com.scoma.pages.TrainingPage;

import org.testng.annotations.Test;;

public class TrainingTest extends LoginTest
{
	
	TrainingPage tp = new TrainingPage(driver);
	
	@Test(priority=1)
	public void verifyTrainingBtn()
	{
		tp.click_training();
	}
	
	@Test(dependsOnMethods={"verifyTrainingBtn"},priority = 2)
	public void verifyUploadBtn()
	{
		tp.click_uploadfiles();
	}
	
	@Test(priority=3)
	public void verifyAreaToUpload()
	{
		tp.clickOnAreaToUplaod();
	}
	
	@Test(priority=4)
	public void verifyAnalyticsBtn()
	{
		tp.clickOnAnalytics();
	}
}
