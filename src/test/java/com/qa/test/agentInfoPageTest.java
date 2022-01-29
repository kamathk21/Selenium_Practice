package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.testBase;
import com.qa.pages.agentInfoPage;
import com.qa.pages.propertiesPage;
import com.qa.pages.propertyInfoPage;
import com.qa.pages.searchPage;

public class agentInfoPageTest extends testBase {

	agentInfoPage agentinfo;
	propertyInfoPage propinfo;
	propertiesPage proppage;
	searchPage searchpage;

	public agentInfoPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		agentinfo = new agentInfoPage();
		propinfo = new propertyInfoPage();
		proppage = new propertiesPage();
		searchpage = new searchPage();
	}

	@Test
	public void agentnameTest() {
		searchpage.searchArea("London");
		proppage.clickProperty(5);
		String propagentname = propinfo.displayAgentName();
		propinfo.clickonAgentLogo();
		String agentname = agentinfo.getAgentName();
		Assert.assertEquals(agentname, propagentname);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
