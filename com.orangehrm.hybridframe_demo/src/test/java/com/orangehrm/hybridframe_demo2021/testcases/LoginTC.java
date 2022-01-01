package com.orangehrm.hybridframe_demo2021.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.hybrid_demo.testBase.TestBase;
import com.orangehrm.hybridframr_demo.pageObject.LoginPage;

public class LoginTC extends TestBase {
	

@Test
public void loginToOrangeHrmTC002() {
	
LoginPage lp = new LoginPage(driver);
lp.setUserName(configDataProvider.getUsername());
lp.setPassword(configDataProvider.getPwd());

//  lp.setUserName(configDataProvider.getValue("username"));
//  lp.setPassword(configDataProvider.getValue("password"));

lp.clickOnLoginBtn();

if(driver.findElement(By.xpath("//a[@id='menu_dashboard_index']")).isDisplayed()){
	Assert.assertTrue(true);
}
else {
	Assert.assertTrue(false, "Dashboard page title not contains Orange text");
	
}
}
}