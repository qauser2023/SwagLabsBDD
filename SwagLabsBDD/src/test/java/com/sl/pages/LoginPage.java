package com.sl.pages;

import org.openqa.selenium.By;

import com.sl.base.TestBase;

public class LoginPage extends TestBase {

	By loginBtn = By.id("login-button");
	By usernameRqdErrMsg = By.xpath("//*[text()='Epic sadface: Username is required']");

	By usernameTxtBox = By.id("user-name");
	By passwordTxtBox = By.id("password");

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

	public void enterUsername() {
		driver.findElement(usernameTxtBox).sendKeys(prop.getProperty("stdUsername"));
	}

	public void enterPassword() {
		driver.findElement(passwordTxtBox).sendKeys(prop.getProperty("password"));
	}

}
