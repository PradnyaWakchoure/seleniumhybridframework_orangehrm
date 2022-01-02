package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseandQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://naukri.com");
		driver.close();
//        driver.quit();
		

	}

}
