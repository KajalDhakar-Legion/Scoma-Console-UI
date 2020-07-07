package com.scoma.test;

import org.testng.annotations.Test;

import com.scoma.pages.BaseClass;
import com.scoma.pages.LoginPage;
import com.scoma.utilities.ExcelUtility;

public class LoginTest extends BaseClass{
	
	@Test(priority = 0)
	public void loginApp() throws Exception
	{
		LoginPage lp = new LoginPage(driver);
		
		ExcelUtility util = new ExcelUtility("C://Users//Lenovo//Desktop//Scoma.xlsx");
		String org =  util.getExcelFile("loginData", 2, 0);
		String emailAddress = util.getExcelFile("loginData", 2, 1);
		String pwd = util.getExcelFile("loginData", 2, 2);
		lp.login(org, emailAddress, pwd);
	
	}

//
//	@Test(priority = 1)
//	public void verify_dashboard()
//	{
//		DashboardPage dp = new DashboardPage(driver);
//		dp.clickOnMenuBtn();
//		dp.dashboard();
//		dp.dashboard();
//	} 
}
