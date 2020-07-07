package com.scoma.test;


import org.testng.annotations.Test;

import com.scoma.pages.SelectEntityPage;

public class SelectEntity extends Login{
	@Test
	public void select_entity()
	{
		SelectEntityPage sep = new SelectEntityPage(driver);
		sep.SelectEntity();
	}
}
		
