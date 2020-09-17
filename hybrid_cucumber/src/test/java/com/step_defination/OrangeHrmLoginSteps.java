package com.step_defination;


import com.base_class.Library;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reuseablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmLoginSteps extends Library{

	    OrangeHrmLoginPage orangeHrmlLoginPage;
	    SeleniumUtility seleniumUtility;
		
		@Given("To launch the browser and Navigate to the Url")
		public void to_launch_the_browser_and_Navigate_to_the_Url() {
		    browserSetUp();
		    logger.info("Browser Launched");
		}
		
		@When("To Enter Username and Password")
		public void to_Enter_Username_and_Password() {
			orangeHrmlLoginPage = new OrangeHrmLoginPage(driver);
		    orangeHrmlLoginPage.LoginUser(properties.getProperty("username"),properties.getProperty("password"));   
		    logger.info("Entered Username and Password");
		}
		
		@Then("To Click the Submit button")
		public void to_Click_the_Submit_button() {
		  orangeHrmlLoginPage = new OrangeHrmLoginPage(driver);	
		  orangeHrmlLoginPage.Submit();
		  logger.info("Login Button Clicked");
		}
		
		@Then("To Take the Screenshot and the Title")
		public void to_Take_the_Screenshot_and_the_Title() {
			seleniumUtility = new SeleniumUtility(driver);
			seleniumUtility.to_take_screenshot("LoginPage");
			seleniumUtility.getTitle();
			logger.info("Taken Screenshot Of Login Page And Title printed in console");
		}
		
		
		
}
