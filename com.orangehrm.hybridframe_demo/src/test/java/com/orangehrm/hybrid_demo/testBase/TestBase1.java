package com.orangehrm.hybrid_demo.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase1 {
public static WebDriver  driver =null;
	
	@BeforeSuite
	public void init() {
		
	}
	
	@BeforeTest
	@Parameters({"browser","url"})
	public void setUp(@Optional("Chrome")String browser, String url) {
		if(browser.equals("Chrome")) {
			//System.setPrperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			//System.setPrperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Browser not matched with any driver exe. please try again");
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}



