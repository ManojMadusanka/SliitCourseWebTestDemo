package com.courseweb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.courseweb.qa.base.TestBase;
import com.courseweb.qa.pages.HomePage;
import com.courseweb.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage lgPage;
	HomePage hmPage;
	public LoginPageTest() {
			super();
}
	@BeforeMethod
	public void SetUp() {
		initialization();
		lgPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=lgPage.validateTitle();
		Assert.assertEquals(title, "CourseWeb | Sri Lanka Institute of Information Technology");
		
	}
	
	
	@Test(priority=2)
    public void loginTest() {
		hmPage=lgPage.login(prop.getProperty("uid"), prop.getProperty("pwd"));
	}

	@AfterMethod
	public void exit() {
		driver.quit();
	}
}
