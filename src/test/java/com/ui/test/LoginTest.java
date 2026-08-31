package com.ui.test;

import static com.constants.Browser.CHROME;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest{

	HomePage homepage;

	@BeforeMethod(description = " Load the Home page of the Website")
	public void setup() {
		homepage = new HomePage(CHROME);

	}

	@Test(description = "Verify if the Valid User is able to login into the application", groups = { "E2E", "Sanity" })
	public void loginTest() {

		assertEquals(homepage.goToLoginPage().doLoginWith("yojip14864@copawoke.com", "password").getUserName(),
				"Kitty kitty");

	}

}
