package com.scoma.test;


import org.testng.annotations.Test;

import com.scoma.pages.BaseClass;
import com.scoma.pages.SelectEntityPage;

public class SelectEntityTest extends BaseClass{
	@Test
	public void select_entity()
	{
		SelectEntityPage sep = new SelectEntityPage(driver);
		sep.SelectEntity();
	}
}
		
