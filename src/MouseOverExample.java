import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		WebElement testing = driver.findElementByXPath("//span[text()='Testing']");
		Actions act = new Actions(driver);
		act.moveToElement(testing).perform();
		
		Thread.sleep(3000);
		

	}

}
