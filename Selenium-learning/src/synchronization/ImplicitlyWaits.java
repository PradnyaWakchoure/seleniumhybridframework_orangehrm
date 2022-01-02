package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitlyWaits {

	@Test
	public void waitsInSelenium()  {
		
	System.setProperty("webdriver.chrome.driver", "./Driver1/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("Sign Up")).click();
	
	driver.findElement(By.name("firstname")).sendKeys("Pradnya");
	
	driver.findElement(By.name("lastname")).sendKeys("Wakchoure");
	
	driver.findElement(By.name("reg_email__")).sendKeys("Pradnya@gmail.com");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("Pradnya@123$");
	
	driver.close();
	
	

	}

}
