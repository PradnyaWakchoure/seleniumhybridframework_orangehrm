package com.orangehrm.hybridframe_demo2021.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.hybrid_demo.testBase.TestBase;
import com.orangehrm.hybridframr_demo.pageObject.DashboardPage;
import com.orangehrm.hybridframr_demo.pageObject.LoginPage;

public class LoginDDTC01 extends TestBase {
	
	@Test
	
	public void loginToOrangeHrmTC01() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		String uname = excelDataProvider.getStringCellData(0, 1, 0);
		String pwd = excelDataProvider.getStringCellData(0, 1, 1);
		
		lp.setUserName(uname);
		lp.setPassword(pwd);
		
		DashboardPage dp = lp.clickOnLoginBtn();
		
		if(driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).isDisplayed()){
			Assert.assertTrue(true);
			Thread.sleep(3000);
			dp.logoutOrangeHrm();
		}
		else {
			Assert.assertTrue(false, "Dashboard page title not contains Orange text");
			
		}
	}

}
