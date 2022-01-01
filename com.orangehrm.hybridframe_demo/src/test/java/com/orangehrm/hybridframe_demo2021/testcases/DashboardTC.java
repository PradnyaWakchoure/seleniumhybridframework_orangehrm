package com.orangehrm.hybridframe_demo2021.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.hybrid_demo.testBase.TestBase;
import com.orangehrm.hybridframr_demo.pageObject.DashboardPage;
import com.orangehrm.hybridframr_demo.pageObject.LoginPage;

public class DashboardTC extends TestBase {
	
	@Test
	public void loginToOrangeHrmTC01() {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("asmin123");
		DashboardPage hp = lp.clickOnLoginBtn();
		
		if(driver.findElement(By.xpath("//a[@id='menu_dasahboard_index']")).isDisplayed()) {
			Assert.assertTrue(true);
			hp.logoutOrangeHrm();
		} 
		else {
			Assert.assertTrue(false, "Dashboard page title not contains Orange text");
		}
	}

}
