package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.testBase;
import com.qa.pages.propertiesPage;
import com.qa.pages.searchPage;

public class propertyPageTest extends testBase {

	searchPage searchpage;
	propertiesPage propertypage;

	public propertyPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		propertypage = new propertiesPage();
		searchpage = new searchPage();
	}

	@Test
	public void diplayAllPriceTest() {
		searchpage.searchArea("London");
		propertypage.displayAllPrice();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
