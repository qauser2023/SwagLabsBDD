package com.sl.steps;

import org.junit.Assert;
//import org.junit.Before;

import com.sl.base.TestBase;
import com.sl.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends TestBase{
	
	LoginPage loginPage;
	
	@Before
	public void setUp() {
		// here we can put set up actions
	}
	
	@After
	public void tearDowwn() {
		TestBase.closeBrowser();
	}

	@Given("^user launches the brower$")
	public void user_launches_the_brower() {
		TestBase.initialization();
	}


	@Then("^user should have page title as Swag Labs$")
	public void user_should_have_page_title_as_Swag_Labs() {
		loginPage = new LoginPage();
		String title = loginPage.verifyPageTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		loginPage = new LoginPage();
		loginPage.clickOnLoginButton();
	
	}
	
	@Then("^user should see error message$")
	public void user_should_see_error_message() {
		String actualErrorMsg = loginPage.verifyUsernameIsRequired();
		Assert.assertEquals("Epic sadface: Username is required", actualErrorMsg);
	}
	
}
