package com.scoma.test;

import org.testng.annotations.Test;

import com.scoma.pages.UserManagmentPage;

import org.testng.annotations.Test;

public class UserManagementTest extends LoginTest
{
	UserManagmentPage ump = new UserManagmentPage(driver);
	
	@Test(priority=1)
	public void verifyUserManagementpage()
	{
		ump.clickOnUserMgmtTab();
	}
	
	@Test(priority=2)
	public void verifyAddUserBtn()
	{
		ump.clickOnAddUser();
	}
	
	@Test(dependsOnMethods={"verifyAddUserBtn"},priority=3)
	public void createNewUser()
	{
		ump.createUser("Testing","Sadhvi","TestingSadhvi@gmail.com","12345");
		ump.submitinfo();
	}
}
