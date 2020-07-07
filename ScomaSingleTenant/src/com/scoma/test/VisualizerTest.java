package com.scoma.test;

import org.testng.annotations.Test;

import com.scoma.pages.LoginPage;
import com.scoma.pages.VisualizerPage;

import org.testng.annotations.Test;

public class VisualizerTest extends LoginTest
{
	@Test
  public void verify_Visualizer()
	{		
	  VisualizerPage vp = new VisualizerPage(driver);
		vp.clickbtn();
	}
}
