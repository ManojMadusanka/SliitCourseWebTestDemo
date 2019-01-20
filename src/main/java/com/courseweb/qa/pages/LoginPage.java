package com.courseweb.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.courseweb.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//input[@id='inputName']")
	WebElement txtUid;
	
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement txtPwd;
	
	@FindBy(xpath="//input[@id='inputPassword']")
	WebElement btnLogin;
	
	public LoginPage()
	{
	PageFactory.initElements(driver, this);	
    }
	
	public String validateTitle() {
		return driver.getTitle(); 
	}
		
	public HomePage login(String uid,String pwd)
	{
		txtUid.sendKeys(uid);
		txtPwd.sendKeys(pwd);
		btnLogin.submit();
		return new HomePage();
	}
	
	
	
}
