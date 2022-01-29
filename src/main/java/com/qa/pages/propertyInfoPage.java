package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class propertyInfoPage extends testBase{
	
	@FindBy(xpath="//p[@class='css-1g2z706-Text-AgentName e1swwt8d3']")
	WebElement agentname;
	
	@FindBy(xpath="//a[@data-testid='agent-image-link']")
	WebElement logo;
	
	public propertyInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String displayAgentName() {
		String name= agentname.getText();
		return name;
	}

	public agentInfoPage clickonAgentLogo() {
		logo.click();
		return new agentInfoPage();
	}
}
