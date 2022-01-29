package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.testBase;
import com.qa.pages.agentInfoPage;
import com.qa.pages.propertiesPage;
import com.qa.pages.propertyInfoPage;
import com.qa.pages.searchPage;

public class propertyInfoPageTest extends testBase {

	propertyInfoPage propinfo;
	agentInfoPage agentinfo;
	propertiesPage proppage;
	searchPage searchpage;
	
	public propertyInfoPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		propinfo = new propertyInfoPage();
		proppage=new propertiesPage();
		searchpage= new searchPage();
		agentinfo= new agentInfoPage();
		searchpage.searchArea("London");
		proppage.clickProperty(5);
	}

	@Test(priority=1)
	public void displayAgentTest() {
		String agentname = propinfo.displayAgentName();
		System.out.println("The Name of the Agent is: " + agentname);
	}

	@Test(priority=2)
	public void clickAgentLogo() {
		agentinfo = propinfo.clickonAgentLogo();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
