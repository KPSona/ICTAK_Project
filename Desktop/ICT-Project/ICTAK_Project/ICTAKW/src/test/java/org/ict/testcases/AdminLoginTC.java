package org.ict.testcases;

import org.ict.pages.AdminLoginPage;
import org.testng.annotations.Test;
import org.ict.base.TestBase;

public class AdminLoginTC extends TestBase{
	AdminLoginPage loginAdm = null;
	@Test(priority = 1)
	public void login() throws InterruptedException {
		loginAdm = new AdminLoginPage(driver);		
		
			
	}
}
