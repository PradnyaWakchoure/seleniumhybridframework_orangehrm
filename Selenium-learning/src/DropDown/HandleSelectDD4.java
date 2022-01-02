package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	//	driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dom_dd=driver.findElement(By.name("birthday_month")); 
		WebElement dob_dd=driver.findElement(By.name("birthday_day"));
		HandleSelectDD4.selectDropdownValue(dom_dd, "Jun");
		HandleSelectDD4.selectDropdownValue(dom_dd, "Apr");
		HandleSelectDD4.selectDropdownValue(dom_dd, "Mar");
		HandleSelectDD4.selectDropdownValue(dob_dd, "26");
		
		driver.quit();
      }

	private static void selectDropdownValue(WebElement dropdown, String month) {
		// TODO Auto-generated method stub
		List<WebElement> list_dd = new Select(dropdown).getOptions();
		for(WebElement ele : list_dd) {
			if(ele.getText().equals(month)) {
				//System.out.println(month);
				ele.click();
				break;
			}
		}
	}

}
