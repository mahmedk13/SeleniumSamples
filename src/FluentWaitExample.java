import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		
		
		driver.findElementById("identifierId").sendKeys("mahmedk13");
		driver.findElementById("identifierId").sendKeys(Keys.ENTER);
		

		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(10))
				    .pollingEvery(Duration.ofSeconds(2)).withMessage("Waited for 10 seconds but element not available")
				    .ignoring(NoSuchElementException.class);
		
		
		WebElement password = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));

	  
		
		
		
		
		password.sendKeys("abc");
		
		
		
		
		
	}

}
