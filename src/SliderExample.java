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

public class SliderExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		
		WebElement slider = driver.findElementByXPath("//div[@id='slider']/span");
		WebElement mainSlider = driver.findElementById("slider");
		
		int xoffset = mainSlider.getSize().getWidth()/4;
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, xoffset, 0).perform();
		
		
		
		
		
	}

}
