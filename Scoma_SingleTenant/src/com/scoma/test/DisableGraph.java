package com.scoma.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.scoma.pages.DisableGraphPage;
import com.scoma.pages.LoginPage;

public class DisableGraph extends Login{


WebDriver driver;
	
@Test
public void Disable() {
   
	DisableGraphPage Disable = new DisableGraphPage(driver);
	Disable.DisableGraph();
}
}