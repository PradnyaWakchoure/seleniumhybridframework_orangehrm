package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Waits_In_Selenium {
		
		@Test
		public void waitsInSelenium() throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Pradnya");
		Thread.sleep(6000);
		
		driver.findElement(By.name("lastname")).sendKeys("Wakchoure");
		Thread.sleep(4000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pradnya@123$");
		Thread.sleep(10000);
		
		driver.quit();
	}
	

}
