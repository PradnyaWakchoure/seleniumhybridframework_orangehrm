package switchTo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		System.out.println("total number of iframes on the page:"+iframes.size());
		
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@title='Rich Text Area. Press ALT-0 for help.']"));
        driver.switchTo().frame(frameEle);
        
        String para = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
        System.out.println(para);
        
        WebElement textBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        
        textBox.clear();
        textBox.sendKeys("Hello all");
        
        driver.quit();
	}

}
