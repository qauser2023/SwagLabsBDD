package com.sl.pages;

import org.openqa.selenium.By;

import com.sl.base.TestBase;

public class ProductsPage extends TestBase {

	By productsHeader = By.xpath("//*[text()='Products']");
	
	
	public boolean verifyProductPage() {
		return driver.findElement(productsHeader).isDisplayed();
	}

	

}
