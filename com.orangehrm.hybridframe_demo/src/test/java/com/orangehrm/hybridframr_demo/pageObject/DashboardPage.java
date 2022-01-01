package com.orangehrm.hybridframr_demo.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver Idriver) {
		this.driver = Idriver;
		PageFactory.initElements(driver, this);
	}
	
	//OR
	
	@FindBy(id="welcome")
	@CacheLookup
	WebElement userId;
	
	@FindBy(xpath="//a[text()=['Logout']")
	@CacheLookup
	WebElement logoutLink;
	
	public void logoutOrangeHrm() {
		
		try {
			userId.click();
			Thread.sleep(2000);
			logoutLink.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	}
	
	
	
	
	


