package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class agentInfoPage extends testBase{

	@FindBy(xpath="//div[@id='content']//b[1]")
	WebElement agentname;
	
	public agentInfoPage() {
		PageFactory.initElements(driver, this);	
	}
	
	public String getAgentName(){
		String agentName=agentname.getText();
		return agentName;
	}
}
