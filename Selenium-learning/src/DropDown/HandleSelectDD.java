package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	//	driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dob_dd=driver.findElement(By.name("birthday_day"));
		WebElement dom_dd=driver.findElement(By.name("birthday_month"));
		WebElement doy_dd=driver.findElement(By.name("birthday_year"));
		
		Select sel_dob=new Select(dob_dd);
		sel_dob.selectByIndex(25);
		sel_dob.selectByValue("16");
		sel_dob.selectByVisibleText("22");
		
		Select sel_dom=new Select(dom_dd);
		Select sel_doy=new Select(doy_dd);
		
		sel_dob.selectByIndex(20);
		sel_dom.selectByVisibleText("Apr");
		sel_doy.selectByValue("1994");
	//	Thread.sleep(5000);
		driver.quit();		
		
		

	}

}
