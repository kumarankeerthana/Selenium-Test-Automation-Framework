package com.ui.pages;

import org.openqa.selenium.By;

/*
 * PAGE OBJECT MODEL - design pattern - how we design the classes 
 * 1. we create the locators - by class constants - why constant ?? --> because the locator is not getting updated.
 * 2. Naming conventions change - because it is final static. 
 * 3. if the variable becomes static it is class varibales - not instance varibale 
 * 4. 
 */

import com.constants.Browser;
import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {
	static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");
	

	public HomePage(Browser browsername) { 
		//the parent has a constructor - it is the job of the child class to call the parent class 
		//constructor using super keyword.
		//Parent classes are marked with abstract keyword. - abstarct classes can have constructor.
		//you cannot create object of abstract class - mark browser utility as abstract 
		// since we cannot create objects we cannot call the constructor - the child classes call it using super keyword.
		super(browsername);
		goToWebsite("https://automationpractice.techwithjatin.com");

	}

	public LoginPage goToLoginPage() { // page functions 
		//page functions should not habe void return type.
		// we are able to access the clickOn method from browser utility without object creation 
	    // We achieve this with the help of inheritance.

		clickOn(SIGN_IN_LINK_LOCATOR); 

		LoginPage loginpage  = new LoginPage(getDriver());
		return loginpage;

	}
}
