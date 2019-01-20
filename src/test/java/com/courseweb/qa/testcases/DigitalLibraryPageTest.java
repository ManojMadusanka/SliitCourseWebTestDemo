package com.courseweb.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.courseweb.qa.base.TestBase;
import com.courseweb.qa.pages.DigitalLibraryPage;
import com.courseweb.qa.pages.DownLoadPage;
import com.courseweb.qa.pages.HomePage;
import com.courseweb.qa.pages.LoginPage;

public class DigitalLibraryPageTest extends TestBase{
	LoginPage lgPage;
	HomePage hmPage;
	DigitalLibraryPage dgtlPage;
  
	public DigitalLibraryPageTest() {
		super();
	}

	@BeforeMethod
	public void startUp() {
		initialization();
		lgPage = new LoginPage();
		hmPage = lgPage.login(prop.getProperty("uid"), prop.getProperty("pwd"));
		dgtlPage = hmPage.clickOnDigitalLibrary();

	}

	@Test(priority = 1)
	public void It2018PaperFolderTest() {
		dgtlPage.clickOnFolder();
	//	System.out.println("ok");

	}
	
	

	@AfterMethod
	public void exit() {
		driver.quit();

	}
   
}
