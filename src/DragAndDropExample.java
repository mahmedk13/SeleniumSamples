import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
		

	}

}
