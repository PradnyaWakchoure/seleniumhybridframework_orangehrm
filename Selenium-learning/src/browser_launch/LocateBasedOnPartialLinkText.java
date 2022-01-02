package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
   //		driver.findElement(By.partialLinkText("English")).click();
   //	driver.findElement(By.partialLinkText("Forgotten")).click();
//	driver.findElement(By.partialLinkText("UK")).click();
		driver.findElement(By.partialLinkText("pass")).click();
		driver.quit();


	}

}
