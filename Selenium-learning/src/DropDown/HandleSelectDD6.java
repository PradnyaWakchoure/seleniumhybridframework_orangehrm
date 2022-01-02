package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleSelectDD6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	//	driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		String month_dd = "//select[@name='birthday_month']/options";
		String day_dd = "//select[@name='birthday_day']/options";
		String year_dd = "//select[@name='birthday_year']/options";
		
		selectDropdown(driver,month_dd,"Apr");
		selectDropdown(driver,day_dd,"22");
		selectDropdown(driver,year_dd,"1981");
		
		Thread.sleep(3000);
		
	//	driver.quit();
	}

     private static void selectDropdown(WebDriver driver, String xpath, String selectvalue) {
		// TODO Auto-generated method stub
		List<WebElement> dd_list = driver.findElements(By.xpath(xpath));
		for(WebElement ele : dd_list) {
			String month = ele.getText();
			if(month.equals(selectvalue)) {
				ele.click();
				break;
			}
		}	
		}	}

	


