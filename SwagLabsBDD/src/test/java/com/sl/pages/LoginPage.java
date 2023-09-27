package com.sl.pages;

import org.openqa.selenium.By;

import com.sl.base.TestBase;

public class LoginPage extends TestBase {

	By loginBtn = By.id("login-button");
	By usernameRqdErrMsg = By.xpath("//*[text()='Epic sadface: Username is required']");

	public String verifyPageTitle() {
		return driver.getTitle();
	}

	public void clickOnLoginButton() {
		driver.findElement(loginBtn).click();
	}
	
	public String verifyUsernameIsRequired() {
		String errMsg = driver.findElement(usernameRqdErrMsg).getText();
		return errMsg;
	}
}
