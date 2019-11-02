import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAlert {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.findElement(By.name("proceed")).click();
		
		/*Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();*/
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alert.getText());
		alert.accept();
	}

}
