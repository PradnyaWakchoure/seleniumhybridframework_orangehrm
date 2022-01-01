package com.orangehrm.hybrid_demo.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.orangehrm.hybridframe_demo.utility.ConfigDataProvider;
import com.orangehrm.hybridframe_demo.utility.ExcelDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver  driver =null;
	public static ConfigDataProvider configDataProvider = null;
	public static ExcelDataProvider excelDataProvider = null;
	public static String configDataPath = "./Config/config.properties";
	public static String excelDataPath = "./Data/TestData.xlsx";
	
	@BeforeSuite
	public void init() {
		configDataProvider = new ConfigDataProvider(configDataPath);
		excelDataProvider = new ExcelDataProvider(excelDataPath);
		
	}
	
	@BeforeTest
	@Parameters({"browser"})
	public void setUp(@Optional("Chrome")String browser) {
		
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
		driver.get(configDataProvider.getUrl());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
