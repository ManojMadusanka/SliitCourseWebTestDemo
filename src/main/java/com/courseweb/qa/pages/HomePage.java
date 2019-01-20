package com.courseweb.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.JCommander.Builder;
import com.courseweb.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//a[@title='Libraries']")
	WebElement  mnuLibraries;
	
	@FindBy(xpath="//a[@title='Digital Library']")
	WebElement drpdwnDigital;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
 	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}	
	public DigitalLibraryPage clickOnDigitalLibrary() {
		Actions actions=new Actions(driver);
		actions.moveToElement(mnuLibraries).build().perform();
		drpdwnDigital.click();
		return  new DigitalLibraryPage();		
				
	}
		
	
}

