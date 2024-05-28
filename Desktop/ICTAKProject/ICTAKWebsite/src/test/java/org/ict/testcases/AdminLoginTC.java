package org.ict.testcases;

import org.ict.base.TestBase;
import org.ict.pages.AdminLoginPage;
import org.ict.pages.DashBoardPage;
import org.testng.annotations.Test;

public class AdminLoginTC extends TestBase {
	AdminLoginPage adminloginpage=null;
	DashBoardPage dashboardPage=null;
	@Test
	public void validAdLogin() {
		adminloginpage= new AdminLoginPage(driver);
		//dashboardPage = new DashBoardPage(driver);
		
//		adminloginpage.enterUserName();
//		adminloginpage.enterPassword();
//		adminloginpage.clickOnButton();
		
	}
	

}

