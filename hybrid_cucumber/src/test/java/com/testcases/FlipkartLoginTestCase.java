package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;
import com.pages.FlipkartLoginPage;
import com.selenium_reuseablefunction.SeleniumUtility;

public class FlipkartLoginTestCase extends Library{

	FlipkartLoginPage fpage;
	SeleniumUtility seleniumUtil;
	
	@BeforeTest
	public void launchApp()
	{
		browserSetUp();
		logger.info("Browser Launched");
	}
	
	@Test
	public void login() {
		
		fpage =new FlipkartLoginPage(driver);
		fpage.LoginUser(properties.getProperty("flipkartUsername"),properties.getProperty("flipkartPassword"));
		logger.info("Browser Login successfully");
	}
	
	@AfterTest
	public void close() {
		
		seleniumUtil = new SeleniumUtility(driver);   
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("loginPage");
		tearDown();  
		logger.info("Closing Browser");
	}
}
