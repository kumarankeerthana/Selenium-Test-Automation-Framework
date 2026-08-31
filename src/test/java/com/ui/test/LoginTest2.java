package com.ui.test;

import static com.constants.Browser.*;
import com.ui.pages.HomePage;

public class LoginTest2 {

	public static void main(String[] args) {
	
	
		HomePage homepage = new HomePage(CHROME);
		String userName = homepage.goToLoginPage().doLoginWith("yojip14864@copawoke.com", "password").getUserName();
		System.out.println(userName);
		
		
		
		

	}

}
