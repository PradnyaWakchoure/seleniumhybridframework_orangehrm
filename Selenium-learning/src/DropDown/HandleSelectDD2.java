package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	//	driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dom_dd=driver.findElement(By.name("birthday_month"));
		Select select = new Select(dom_dd);
		WebElement before_select = select.getFirstSelectedOption();
		String before_select_month = before_select.getText();
		System.out.println("Already selected month is : "+before_select_month);
		select.selectByIndex(5);
		WebElement after_select = select.getFirstSelectedOption();
		String after_select_month = after_select.getText();
		System.out.println("After selection month is : "+after_select_month);

	}

}
