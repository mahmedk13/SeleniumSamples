import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElementsByXPath("//input[@type='checkbox']");
		
		for(WebElement ele: list) {
			
			if(ele.isSelected()) { //ele.isSelected()= true then negation will make it false
				ele.click();					//ele.isSelected()=false then negation will it true and it will go inside if
				
			}
		}
		
		
		
	}

}
