package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility{
	
	static final By EMAIL_TEXTBOX_LOCATOR = By.id("email");
	static final By PASSWORD_TEXTBOX_LOCATOR = By.id("passwd");
	static final By SUBMIT_LOGIN_BUTTON_LOCATOR= By.id("SubmitLogin");


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public MyAccount doLoginWith(String emailAddress , String password) {
		enterText(EMAIL_TEXTBOX_LOCATOR, emailAddress);
		enterText(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(SUBMIT_LOGIN_BUTTON_LOCATOR);
		
		MyAccount myaccount = new MyAccount(getDriver());
		return myaccount;
		
		
		
	}

}
