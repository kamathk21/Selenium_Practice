package com.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testBase;

public class propertiesPage extends testBase{

	@FindBy(xpath = "//div[@class='css-1anhqz4-ListingsContainer earci3d2']//descendant::p[@class='css-1o565rw-Text eczcs4p0']")
	List<WebElement> prices;

	public propertiesPage() {
		PageFactory.initElements(driver, this);
	}

	public void displayAllPrice() {
		ArrayList<String> sortedList=new ArrayList<String>();
		for (int i = 0; i <= prices.size() - 1; i++)
		{
			sortedList.add(prices.get(i).getText().replaceAll("\\D", ""));
		}
		ArrayList<Integer> convertedlist= new ArrayList<Integer>();
		for(String s : sortedList) convertedlist.add(Integer.valueOf(s));

		Collections.sort(convertedlist, Collections.reverseOrder());
		for (int i=0; i <= convertedlist.size()-1;i++)
			System.out.println(convertedlist.get(i));
	}
	
	public propertyInfoPage clickProperty(int propno) {
		String propxpath="//div[@class='css-1anhqz4-ListingsContainer earci3d2']//descendant::a[@data-testid='listing-details-link']";
		driver.findElement(By.xpath(propxpath+"["+propno+"]")).click();
		return new propertyInfoPage();
	}
}
