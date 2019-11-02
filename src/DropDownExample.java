import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement dropdown = driver.findElementById("searchLanguage");
		Select sel = new Select(dropdown);
		//sel.selectByIndex(8);
		//sel.selectByValue("gl");
		sel.selectByVisibleText("Italiano");
		
		List<WebElement> list1 = sel.getAllSelectedOptions();
		
		for(WebElement ele: list1) {
			System.out.println("currently selected value is "+ele.getText());
		}
		
		System.out.println("is my dropdown multiple select? "+sel.isMultiple());
		
		//List<WebElement> list = sel.getOptions();
		List<WebElement> list = driver.findElementsByTagName("option");

		List<String> ddvalues = new ArrayList<String>();
		
		for(WebElement ele : list) {
			ddvalues.add(ele.getText());
		}
		
		System.out.println(ddvalues);
		
		sel.selectByIndex(0);
		sel.selectByValue("0");
		
		

	}

}
