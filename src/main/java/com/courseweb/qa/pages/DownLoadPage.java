package com.courseweb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.courseweb.qa.base.TestBase;

public class DownLoadPage extends TestBase{

	@FindBy(xpath="")
	WebElement dwnldFile;
	
	public DownLoadPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickToDownload() {
        	
	}
	
}
