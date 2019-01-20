package com.courseweb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.courseweb.qa.base.TestBase;

public class DigitalLibraryPage extends TestBase {
	
/*	@FindBy(xpath="//span[@class='instancename'  and text()='2017']//parent::a//parent::div[@class='activityinstance']//parent::div//parent::div//parent::div//parent::li[@id='module-54775']")
*/	
	
	@FindBy(xpath="//li[@id='module-54775']/div/div/div/div/a/span")

	WebElement fldrIt;
	
	public DigitalLibraryPage() {
		PageFactory.initElements(driver, this);
	}

    public DownLoadPage clickOnFolder() {
    	fldrIt.click();
    	return new DownLoadPage();
    	
    }
    
    
}
