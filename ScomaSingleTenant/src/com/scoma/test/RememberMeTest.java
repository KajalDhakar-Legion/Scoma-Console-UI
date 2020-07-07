package com.scoma.test;


import org.testng.annotations.Test;

import com.scoma.pages.BaseClass;
import com.scoma.pages.LogoutPage;

public class RememberMeTest extends BaseClass {

	@Test(priority=0)
	public void loginApp() throws InterruptedException
	{
		
	}

	@Test(priority=1)
	public void LogoutApp() throws InterruptedException
	
	{
		Thread.sleep(25000);
		LogoutPage logoutpage =new LogoutPage(driver);
		logoutpage.Logout();
		
	}
	
}
