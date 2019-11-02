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

public class DynamicTableExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		
		List<WebElement> col = driver.findElementsByXPath("//table[@class='dataTable']/thead/tr/th");
		System.out.println("total cols are "+col.size());
		
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='dataTable']/tbody/tr");
		System.out.println("total rows are "+rows.size());
		
		for(int i=1; i<=rows.size(); i++) {
			for(int j=1; j<=col.size(); j++) {
				WebElement cell = driver.findElementByXPath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]");
				System.out.println("Value of col "+j+" of row "+i+" is: "+cell.getText());
			
			}
			
		}
		
		
	}

}
