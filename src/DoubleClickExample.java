import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement element_dc = driver.findElementByXPath("//button[text()='Double-Click Me To See Alert']");
		Actions action = new Actions(driver);
		action.moveToElement(element_dc).doubleClick().perform();
		Thread.sleep(1500);
		
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		
		
		
		
	}

}
