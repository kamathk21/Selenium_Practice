package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class searchPage extends testBase{
	
	@FindBy(xpath="//input[@id='header-location']")
	WebElement searcharea;
	
	@FindBy(xpath="//button[contains(text(),Search) and @data-testid='search-button']")
	WebElement searchbtn;
	
	
	public searchPage(){
		PageFactory.initElements(driver, this);
	}
	
	public propertiesPage searchArea(String areaname) {
		searcharea.sendKeys(areaname);
		searchbtn.click();
		return new propertiesPage();
	}

}
