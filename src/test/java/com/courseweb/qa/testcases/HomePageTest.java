package com.courseweb.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.courseweb.qa.base.TestBase;
import com.courseweb.qa.pages.DigitalLibraryPage;
import com.courseweb.qa.pages.HomePage;
import com.courseweb.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage lgPage;
	HomePage hmPage;
	DigitalLibraryPage dgtlPage;
	public HomePageTest() {
		super();
 	}

	@BeforeMethod
	public void setUp() {
		initialization();
		lgPage=new LoginPage();
		hmPage=lgPage.login(prop.getProperty("uid"), prop.getProperty("pwd"));
		
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String title=hmPage.validateHomePageTitle();
		Assert.assertEquals(title, "Dashboard");
	}
	
	@Test(priority=2)
	public void moveToDigitalPageTest() {
		dgtlPage=hmPage.clickOnDigitalLibrary();
	}
	@AfterMethod
	public void exit() {
		driver.quit();
	}
	
	
	
}
