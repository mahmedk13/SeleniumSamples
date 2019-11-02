import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleTabs {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"parentdiv\"]/img").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"custom-button\"]/button").click();
		Thread.sleep(3000);
		
		Set<String> winds = driver.getWindowHandles();
		System.out.println(winds.size());
		
		driver.findElementByXPath("//*[@id=\"main\"]/div/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[1]").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("/html/body/div[4]/div[2]/div[2]/ul/li[1]/a").click();
		
		Thread.sleep(2000);
		winds = driver.getWindowHandles();
		System.out.println(winds.size());
		
		Iterator<String> itr = winds.iterator();
		String firstWindow = itr.next();
		String secondWindow = itr.next();
		System.out.println(secondWindow);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		

		
	}

}
