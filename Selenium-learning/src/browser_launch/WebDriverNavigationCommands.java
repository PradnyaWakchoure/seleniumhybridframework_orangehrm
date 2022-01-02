package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.facebook.com/");
        driver.findElement(By.linkText("English (UK)")).click();
        System.out.println("Title of the facebook login page:" +driver.getTitle());
        driver.findElement(By.linkText("Forgotten password?")).click();
        System.out.println("Facebook forgot password page:" +driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        driver.quit(); 

	}

}
