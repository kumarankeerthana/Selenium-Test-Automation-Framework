package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.constants.Browser;

public abstract class   BrowserUtility {
	
	//Parent classes are marked with abstract keyword. - abstarct classes can have constructor.
			//you cannot create object of abstract class - mark browser utility as abstract 
			// since we cannot create objects we cannot call the constructor - the child classes call it using super keyword.
	//utility classes should have multiple constructors. - multiple ways of creating objects.
	
	private WebDriver driver;

	public BrowserUtility(WebDriver driver) { //initialize instance varibale -- constructor
		super();
		this.driver = driver;
	} 
	
	//creating wrapper methods 
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public BrowserUtility(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.err.println("Please enter a valid browser name. Please select chrome or Edge only");
		}
	}
	
	public BrowserUtility(Browser browsername) {
		if(browsername == Browser.CHROME) {
			driver = new ChromeDriver();
		}
		else if (browsername == Browser.EDGE) {
			driver = new EdgeDriver();
		}else {
			System.err.println("Please enter a valid browser name");
		}
	}


	

	public void goToWebsite(String url) {
		driver.get(url);	}
	
	
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
		
	}
	
	public void clickOn(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}
	
	public void enterText(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	
	
	public String getVisibleText(By locator) {
		WebElement element = driver.findElement(locator);
		return element.getText();
	}

}
