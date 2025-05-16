
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CaptureItemDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList = drop.findElements(By.tagName("option"));
		System.out.println( "Total DropDown List:" + dropList.size());
		
		for(WebElement item : dropList) {
			System.out.println(item.getText());
		}
			driver.quit();
		}
}



