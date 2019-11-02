import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(1);
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElementsByTagName("iframe");
		
		System.out.println(frames.size());
		
		for(WebElement ele : frames) {
			System.out.println(ele.getAttribute("id"));
		}
		
		
	}

}
