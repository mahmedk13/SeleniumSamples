import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement element_rc = driver.findElementByXPath("//span[@class='context-menu-one btn btn-neutral']");
		Actions action = new Actions(driver);
		action.moveToElement(element_rc).contextClick().perform();
		Thread.sleep(1500);
		driver.findElementByXPath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']").click();
		
	}

}
