package com.scoma.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.scoma.pages.DisableGraphPage;



public class DisableGraphTest {


WebDriver driver;
	
@Test
public void Disable() {
   
	DisableGraphPage Disable = new DisableGraphPage(driver);
	Disable.DisableGraph();
}
}