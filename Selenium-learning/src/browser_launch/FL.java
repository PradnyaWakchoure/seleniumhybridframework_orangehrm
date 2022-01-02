package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class FL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
         

	}

}
