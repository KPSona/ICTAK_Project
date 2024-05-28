package org.ict.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.ict.testcases.TestBase;




public class AdminLoginPage {
	WebDriver driver;
	public AdminLoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
}
