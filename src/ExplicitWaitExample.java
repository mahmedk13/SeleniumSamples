import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		
		
		driver.findElementById("identifierId").sendKeys("mahmedk13");
		driver.findElementById("identifierId").sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));

		//WebElement password = driver.findElementByXPath("//input[@name='password']");
		element.sendKeys("abc");
		
		
		
		
		
	}

}
