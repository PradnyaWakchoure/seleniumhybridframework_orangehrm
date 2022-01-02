package DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleSelectDD5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
	//	driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		
		List<WebElement> dd_list = driver.findElements(By.xpath("//select[@name='birthday_month']/options"));
		for(WebElement ele : dd_list) {
			if(ele.getText().equals("Apr")) {
				ele.click();
				break;
				
			

	}

}
		
    driver.quit();
	}}