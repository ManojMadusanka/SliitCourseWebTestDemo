package com.courseweb.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.courseweb.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
 
		try {
			prop=new Properties();
			FileInputStream input=new FileInputStream("C:\\Users\\pissu_hadei\\eclipse-workspace\\TestCoureWeb\\src\\main\\java\\com\\courseweb\\qa\\config\\config.properties");
			prop.load(input);
		} catch (Exception e) {
           e.printStackTrace(); 
		}
		
		
	}
	
	public static void initialization() {
		
		String browser=prop.getProperty("browser");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_Load_Time_out, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		

	}
	
	

}
