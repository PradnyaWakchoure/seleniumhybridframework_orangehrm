package browser_launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement language = driver.findElement(By.partialLinkText("Uk"));language.click();
		List<WebElement> list_a = driver.findElements(By.tagName("a"));
		int totalLink = list_a.size();
		System.out.println("Total Num Of Links On Facebook login page are : "+totalLink);
				

	}

}
