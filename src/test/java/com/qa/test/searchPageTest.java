package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.testBase;
import com.qa.pages.propertiesPage;
import com.qa.pages.searchPage;

public class searchPageTest extends testBase{
	
	searchPage searchpage;
	propertiesPage propertypage;
	
	public searchPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		searchpage= new searchPage();
		
	}
	
	@Test
	public void searchAreaTest()
	{
	  propertypage= searchpage.searchArea("London");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
