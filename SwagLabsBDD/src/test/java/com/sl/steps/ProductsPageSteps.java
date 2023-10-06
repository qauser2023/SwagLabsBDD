package com.sl.steps;

import org.junit.Assert;

import com.sl.base.TestBase;
import com.sl.pages.ProductsPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;


public class ProductsPageSteps extends TestBase{
	
	ProductsPage prouctsPage;
	
	@Before
	public void setUp() {
		// here we can put set up actions
	}
	
	@After
	public void tearDowwn() {
		TestBase.closeBrowser();
	}

	@Then("^user should be taken to Products page$")
	public void user_should_be_taken_to_Products_page() {
		prouctsPage = new ProductsPage();
		boolean flag = prouctsPage.verifyProductPage();// t?f
		Assert.assertTrue(flag);
	}
	
	
}
