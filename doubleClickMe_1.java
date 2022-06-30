package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMe_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		WebElement doubleClickMe = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

		Actions a = new Actions(driver);
		
		a.moveToElement(doubleClickMe).doubleClick().build().perform();

		//driver.close();
	
	
	
	
	
	
	
	
	
	
	}

}
