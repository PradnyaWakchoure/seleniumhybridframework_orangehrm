package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");

}
}