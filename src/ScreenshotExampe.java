import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotExampe {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		
		String time = sdf.format(d).replace(":", "_");
		
		System.out.println(time);
		
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screenshots/"+"screenshot"+time+".png"));
		
		

	}

}
