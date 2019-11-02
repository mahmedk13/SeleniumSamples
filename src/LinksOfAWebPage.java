import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksOfAWebPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		/*
		 * List<WebElement> links = driver.findElementsByTagName("a");
		 * System.out.println("total num of links on the page are "+links.size());
		 * 
		 * 
		 * 
		 * 
		 * for(int i=0; i<links.size(); i++) {
		 * System.out.println("url of the "+i+" link is:"+links.get(i).getAttribute(
		 * "href")); }
		 */
		
		WebElement footer = driver.findElementByXPath("//div[@class='footer']");
		List<WebElement> links = footer.findElements(By.tagName("a"));
		
		System.out.println("total links in the footer are "+links.size());
		
		for(int i=0; i<links.size(); i++) {
			System.out.println("url of the "+i+" link is:"+links.get(i).getAttribute( "href"));
		}
		
		
		
		
		
		
	}

}
