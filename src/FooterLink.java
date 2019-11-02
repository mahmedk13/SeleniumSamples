import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLink {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement footer = driver.findElementByXPath("//div[@class='footer']");
		List<WebElement> links = footer.findElements(By.tagName("a"));
		System.out.println("total links are "+links.size());


		for(WebElement ele: links) {
			System.out.println("links url are "+ele.getAttribute("href"));
		}
		
		
	}

}
